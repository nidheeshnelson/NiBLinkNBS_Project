import { Component, Input, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import {CustomerService} from './customer.service';
import {FormsModule} from '@angular/forms';
import {AdminService} from '../admin/admin.service';
@Component({
  selector: 'app-customer',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './customer.component.html',
  styleUrl: './customer.component.css'
})
export class CustomerComponent implements OnInit{
  @Input() customerResponse: any;
  customerid: string='';
  activeDiv: number | null = null; // Variable to track active div, initially set to null
  active1Div: number | null = null;
  active12Div: number | null = null;
  active2Div: number | null = null;
  active22Div: number | null = null;
  active24Div: number | null = null;
  active243Div: number | null = null;
  response:any;
  response1:any;
  response2:any;
  response3:any;
  response4:any;
  response5:any;
  response6:any;
  response7:any;
  response8:any;
  public response9:any[]=[];
  response10:any;
  response11:any;
  response12:any;
  response13:any;
  response14:any;
  selectedItem1:any;
  selectedItem2:any;
  selectedItem3:any;
  selectedItem4:any;
  selectedItem5:any;
  selectedItem6:any;
  payamount:any;
  customername:string='';
  contact:string='';
  address:string='';
  landmark:string='';
  
  jobdate:Date | null = null;
  constructor(private cs:CustomerService, private as:AdminService){}
  ngOnInit(): void {
    this.customerid = this.customerResponse?.ID;
  }
  async countryList(){
    // console.log(data);
    try{
      const result = await this.as.countryList();
     this.response1=result as any[];
    console.log(`in expert.component.ts ${this.response1}`);
    }catch(error){console.error(`Error in countryList:`, error);}
  }
  async stateByCountryCode() {
    const countrycode = this.selectedItem1?.countrycode;
    if (countrycode) {
        console.log(`Selected Country Code: ${countrycode}`);
        const result = await this.as.stateListByCountry(countrycode);
        this.response2 = result as any[];
        console.log(this.response2)
    } else {
        console.log('Country code is null or undefined.');
    }
}
async districtByStateCode() {
  const statecode = this.selectedItem2?.statecode;
  if (statecode) {
      console.log(`Selected Country Code: ${statecode}`);
      const result = await this.as.districtListByState(statecode);
      this.response3 = result as any[];
      console.log(this.response3)
  } else {
      console.log('Country code is null or undefined.');
  }
}
async talukbyDistrictCode() {
  const districtcode = this.selectedItem3?.districtcode;
  if (districtcode) {
      console.log(`Selected Country Code: ${districtcode}`);
      const result = await this.as.talukListByDistrict(districtcode);
      this.response4 = result as any[];
      console.log(this.response4)
  } else {
      console.log('Country code is null or undefined.');
  }
}
async jobList(){
  // console.log(data);
  try{
    const result = await this.as.jobList();
   this.response5=result as any[];
  console.log(`in expert.component.ts ${this.response5}`);
  }catch(error){console.error(`Error in countryList:`, error);}
}
async findShifts(){
  try{
  const thalukid = this.selectedItem4?.thalukcode;
  const jobid = this.selectedItem5?.jobcode;
  const jobdate = this.jobdate
console.log("in find shift",thalukid,jobid,jobdate)
this.response6 = await this.cs.findShiftByDate({thalukid,jobid,jobdate});
      console.log(this.response6)
  }catch(error){console.error(`Error in countryList:`, error);}
}
async findShifts1(){
  try{
  const thalukid = this.selectedItem4?.thalukcode;
  const jobid = this.selectedItem5?.jobcode;
console.log("in find shift",thalukid,jobid)
this.response7 = await this.cs.findShift({thalukid,jobid});
      console.log(this.response7)
  }catch(error){console.error(`Error in countryList:`, error);}
}
async requestShift(data:any){
try{
  const shiftid = this.selectedItem6?.generatedshiftid;
  const shiftdate = this.selectedItem6?.shiftdate;
  const shifttime = this.selectedItem6?.shifttime;
  const expertid = this.selectedItem6?.expertid;
  const customerid = this.customerid;
  const address = this.address;
  const landmark = this.landmark;
  const customername = this.customername;
  const customercontact = this.contact;
  console.log("in request shift customer component",shiftid,shiftdate,shifttime,expertid,customerid,address,landmark,customername,customercontact);
  this.response8 = await this.cs.requestShift({shiftid,shiftdate,shifttime,expertid,customerid,address,landmark,customername,customercontact});
  console.log("response from request shifts",this.response8.SHIFTREQID);
}catch(error){console.error(`Error in countryList:`, error);}
}
async totalamount(){
  try{
    this.response9 = [];
    console.log('after null',this.response9);
    const customerid = this.customerid;
    console.log('in total amount',customerid)
    this.response9 = await this.cs.totalAmount(customerid) as any[];
    console.log(this.response9)
  }catch(error){console.error(`Error in countryList:`, error);}
}
totalamount1(){

}
transactionHistory(){

}
async card(data:any){
    const payeeid=this.customerid;
    const shiftid=this.payamount?.shiftid;
    const debitcardnumber=data.cardnumber;
    const expirationdate=data.expire;
    const cvc=data.cvc;
    const password=data.password;
    const amountget=this.payamount?.hoursforwork;
    console.log(payeeid,shiftid,debitcardnumber,expirationdate,cvc,password,amountget)
    this.response = await this.cs.cardPay({payeeid,shiftid,debitcardnumber,expirationdate,cvc,password,amountget});
    console.log('in card customer component',this.response.TRANSACTION)
}
async netbanking(data:any){
    const payeeid=this.customerid;
    const shiftid=this.payamount?.shiftid;
    const netbankingid=data.username;
    const password=data.password;
    const amountget=this.payamount?.hoursforwork;
    console.log(payeeid,shiftid,netbankingid,password,amountget)
    this.response = await this.cs.cardPay({payeeid,shiftid,netbankingid,password,amountget});
    console.log('in netbanking customer component',this.response.TRANSACTION)
}
async upi(data:any){
  const payeeid=this.customerid;
  const shiftid=this.payamount?.shiftid;
  const upiid=data.upiid;
  const password=data.password;
  const amountget=this.payamount?.hoursforwork;
  console.log(payeeid,shiftid,upiid,password,amountget)
  this.response = await this.cs.cardPay({payeeid,shiftid,upiid,password,amountget});
  console.log('in upi customer component',this.response.TRANSACTION)
}
async showCustomerName(){
  const customerid = this.customerid;
  this.response10=await this.as.showCustomerName(customerid);
  console.log(this.response10)
}
async showAddress(){
  const customerid= this.customerid;
  this.response11=await this.as.showAddress(customerid);
}
async showBanking(){
  const customerid= this.customerid;
  this.response12=await this.as.showBanking(customerid);
}
async showIdentity(){
  const customerid= this.customerid;
  this.response13=await this.as.showIdentity(customerid);
}
async showPersonal(){
  const customerid=this.customerid;
  this.response14=await this.as.showPersonal(customerid);
}
async editCustomerName(data:any){
  const customerid=this.customerid;
  const firstname=data.firstname;
  const middlename=data.middlename;
  const lastname=data.lastname;
  this.response=await this.as.editCustomerName({customerid,firstname,middlename,lastname}) ;
}
async editAddress(data:any){
  const addressid= this.customerid;
  const housename= data.housename;
  const street=data.street;
  const landmark=data.landmark;
  const place=data.place;
  const postoffice=data.postoffice;
  const pincode=data.pincode;
  const localbody=data.localbody;
  const districtcode = data.selectedItem3.districtcode;
  const countrycode = data.selectedItem1.countrycode;
  const statecode = data.selectedItem2.statecode;
  const thalukcode= data.selectedItem4.thalukcode;
  this.response=await this.as.editAddress({addressid,housename,street,landmark,place,postoffice,pincode,localbody,districtcode,countrycode,statecode,thalukcode});
}
async editBanking(data:any){
  const bankid= this.customerid;
  const bank=data.bank;
  const branch=data.branch;
  const ifsc =data.ifsc;
  const accountnumber=data.accountnumber;
  const secretpin=data.secretpin;
  const upiid=data.upiid;
  this.response=await this.as.editBanking({bankid,bank,branch,ifsc,accountnumber,secretpin,upiid});
}
async editIdentity(data:any){
  const identityid= this.customerid;
  const adhar=data.adhar;
  const pancard=data.pancard;
  const electionid=data.electionid;
  this.response=await this.as.editIdentity({identityid,adhar,pancard,electionid});
}
async editPersonal(data:any){
  const customerid=this.customerid;
  this.response=await this.as.editPersonal(customerid);
}

  activateDiv(divNumber: number): void {
    this.activeDiv = divNumber;
  }
  activate1Div(divNumber: number): void {
    this.active1Div = divNumber;
  }
  activate12Div(divNumber: number): void {
    this.active12Div = divNumber;
  }
  activate2Div(divNumber: number): void {
    this.active2Div = divNumber;
  }
  activate22Div(divNumber: number): void {
    this.active22Div = divNumber;
  }
  activate24Div(divNumber: number): void {
    this.active24Div = divNumber;
  }
  activate243Div(divNumber: number): void {
    this.active243Div = divNumber;
  }
}
