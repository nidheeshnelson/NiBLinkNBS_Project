import { Component, Input, OnInit } from '@angular/core';
import { CommonModule, Time } from '@angular/common';
import {ExpertService} from './expert.service';
import {AdminService} from '../admin/admin.service';
import {FormsModule} from '@angular/forms';
import { filter } from 'rxjs/operators';
@Component({
  selector: 'app-expert',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './expert.component.html',
  styleUrl: './expert.component.css'
})
export class ExpertComponent implements OnInit{
  @Input() expertResponse: any;
  expertid: string='';
  isShowRequestsButtonVisible= false;
  isStartBtnVisible=false;
  isWorkFinishedVisible=false;
  isfinishformvisible=false;
  response:any;
  response1:any;
  response2:any;
  response3:any;
  response4:any;
  response5:any;
  response6:any;
  response7:any;
  response8:any;
  response9:any;
  response10:any;
  response11:any;
  response12:any;
  response13:any;
  response14:any;
  selectedItem:any;
  selectedItem1:any;
  selectedItem2:any;
  selectedItem3:any;
  selectedItem4:any;
  selectedItem5:any;
  hoursforwork:number=0;
  payment:number=0;
  shiftdate: Date | null = null;
  shifttime: Time | null = null;
  expertname:string | null = null;
  contact:number=0; 
  activeDiv: number | null = null; // Variable to track active div, initially set to null
  active1Div: number | null = null;
  active12Div: number | null = null;
  active2Div: number | null = null;
  constructor(private es:ExpertService, private as:AdminService){}
  ngOnInit(): void {
    this.expertid = this.expertResponse?.ID;
  }
  async paymentrelated(data:any){
    try{
    console.log("In paymentrelated",data);
    const commissionid=data.commission?.generatedcommissionid;
    const paymentperhour=data.payment;
    const paymentid=this.expertid;
    console.log("In paymentrelated",commissionid, paymentperhour,paymentid);
    this.response=await this.es.paymentDetails({paymentid,commissionid,paymentperhour});
    console.log(`in expert.component.ts ${this.response.PAYDET}`);
    } 
    catch (error) {
    console.error("Error in paymentrelated:", error);
    }
  }
  async commissionList(){
    try{
      const result = await this.as.commissionListing();
     this.response1=result as any[];
    console.log(`in signin.component.ts ${this.response1}`);
    }catch(error){console.error(`Error in countryList:`, error);}
  }

  async countryList(){
    // console.log(data);
    try{
      const result = await this.as.countryList();
     this.response2=result as any[];
    console.log(`in expert.component.ts ${this.response2}`);
    }catch(error){console.error(`Error in countryList:`, error);}
  }
  async stateByCountryCode() {
    const countrycode = this.selectedItem1?.countrycode;
    if (countrycode) {
        console.log(`Selected Country Code: ${countrycode}`);
        const result = await this.as.stateListByCountry(countrycode);
        this.response3 = result as any[];
        console.log(this.response3)
    } else {
        console.log('Country code is null or undefined.');
    }
}
async districtByStateCode() {
  const statecode = this.selectedItem2?.statecode;
  if (statecode) {
      console.log(`Selected Country Code: ${statecode}`);
      const result = await this.as.districtListByState(statecode);
      this.response4 = result as any[];
      console.log(this.response4)
  } else {
      console.log('Country code is null or undefined.');
  }
}
async talukbyDistrictCode() {
  const districtcode = this.selectedItem3?.districtcode;
  if (districtcode) {
      console.log(`Selected Country Code: ${districtcode}`);
      const result = await this.as.talukListByDistrict(districtcode);
      this.response5 = result as any[];
      console.log(this.response5)
  } else {
      console.log('Country code is null or undefined.');
  }
}
async jobList(){
  // console.log(data);
  try{
    const result = await this.as.jobList();
   this.response6=result as any[];
  console.log(`in expert.component.ts ${this.response6}`);
  }catch(error){console.error(`Error in countryList:`, error);}
}
async createShift(data:any){
  try{
  console.log("In createshift",data);
  const expertname =data.expertname;
  const shiftdate=data.shiftdate;
  const shifttime=data.shifttime;
  const contact=data.contact;
  const thalukcode=data.taluk?.thalukcode;
  const jobcode=data.job?.jobcode;
  const expertid=this.expertid;
  console.log("In paymentrelated",shiftdate, shifttime,thalukcode, jobcode, expertid);
  this.response=await this.es.createShift({expertname, shiftdate, shifttime, contact, thalukcode, jobcode, expertid});
  console.log(`in expert.component.ts ${this.response.SHIFTID}`);
  } 
  catch (error) {
  console.error("Error in paymentrelated:", error);
  }
}
async findShiftsByExpert(){
  try{
    this.response7=await this.es.findShiftsByExpert(this.expertid)
    console.log(`in expert.component.ts ${this.response7}`);
  }catch(error){console.error(`Error in countryList:`, error);}
}
filterByStatus(status: string) {
  this.response8 = this.response7.filter((item: { status: string }) => item.status === status);
  this.isShowRequestsButtonVisible = false;
  this.response9=null;
  this.isStartBtnVisible=false;
  this.isWorkFinishedVisible=false;
  this.isfinishformvisible=false;
}
showRequests(){
  this.isShowRequestsButtonVisible = true;
}
async findShiftRequestsByShiftId(shiftid: string){
  try{
    this.response9=await this.es.findShiftRequestsByShiftId(shiftid)
    console.log(`in expert.component.ts ${this.response}`);
  }catch(error){console.error(`Error in countryList:`, error);}
}
async acceptRequest(request: any){
  try{
    this.response=await this.es.acceptRequest(request)
    console.log(`in expert.component.ts ${this.response.BOOKEDID}`);
    this.findShiftsByExpert();
    this.response9=null;
  }catch(error){console.error(`Error in countryList:`, error);}
}
showStartBtn(){
  this.isStartBtnVisible=true;
}
async startWork(item:any){
  try{
    this.response=await this.es.startWork(item);
    console.log(`in expert.component.ts ${this.response.SHIFTRUN}`);
    this.findShiftsByExpert();
  }catch(error){console.error(`Error in countryList:`, error);}
}
showWorkFinished(){
  this.isWorkFinishedVisible=true;
  this.isfinishformvisible=false;
}
workFinishing(){
  this.isfinishformvisible=true;
}
async workFinished(item:any){
  try{
    const hoursforwork=this.hoursforwork;
    const generatedshiftid = item.generatedshiftid;
    this.response=await this.es.workFinished({hoursforwork,generatedshiftid});
    console.log(`in expert.component.ts ${this.response.FINI}`);
    this.findShiftsByExpert();
  }catch(error){console.error(`Error in countryList:`, error);}
}
async showExpertName(){
  const expertid = this.expertid;
  this.response9=await this.as.showExpertName(expertid);
}
async showAddress(){
  const expertid= this.expertid;
  this.response11=await this.as.showAddress(expertid);
}
async showBanking(){
  const expertid= this.expertid;
  this.response12=await this.as.showBanking(expertid);
}
async showIdentity(){
  const expertid= this.expertid;
  this.response13=await this.as.showIdentity(expertid);
}
async showPersonal(){
  const expertid=this.expertid;
  this.response14=await this.as.showPersonal(expertid);
}
async editExpertName(data:any){
  const expertid=this.expertid;
  const firstname=data.firstname;
  const middlename=data.middlename;
  const lastname=data.lastname;
  this.response=await this.as.editExpertName({expertid,firstname,middlename,lastname}) ;
}
async editAddress(data:any){
  const addressid= this.expertid;
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
  const bankid= this.expertid;
  const bank=data.bank;
  const branch=data.branch;
  const ifsc =data.ifsc;
  const accountnumber=data.accountnumber;
  const secretpin=data.secretpin;
  const upiid=data.upiid;
  this.response=await this.as.editBanking({bankid,bank,branch,ifsc,accountnumber,secretpin,upiid});
}
async editIdentity(data:any){
  const identityid= this.expertid;
  const adhar=data.adhar;
  const pancard=data.pancard;
  const electionid=data.electionid;
  this.response=await this.as.editIdentity({identityid,adhar,pancard,electionid});
}
async editPersonal(data:any){
  const expertid=this.expertid;
  this.response14=await this.as.editPersonal(expertid);
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
}
