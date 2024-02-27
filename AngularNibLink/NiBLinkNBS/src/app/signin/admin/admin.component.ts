import { Component, Input} from '@angular/core';
import { CommonModule } from '@angular/common';
import {FormsModule} from '@angular/forms';
import {AdminService} from './admin.service';
// import {SigninComponent} from '../signin.component'

@Component({
  selector: 'app-admin',
  standalone: true,
  imports: [CommonModule,FormsModule],
  templateUrl: './admin.component.html',
  styleUrl: './admin.component.css'
})
export class AdminComponent {
  @Input() adminResponse: any;
  adminid: string;
  constructor(private as:AdminService){
    this.adminid = this.adminResponse?.ID;
  }
  activeDiv: number | null = null; // Variable to track active div, initially set to null
  active1Div: number | null = null;
  active12Div: number | null = null;
  active2Div: number | null = null;
  active22Div: number | null = null;
  active4Div: number | null = null;
  active41Div: number | null = null;
  active42Div: number | null = null;
  active43Div: number | null = null;
  active44Div: number | null = null;
  active5Div: number | null = null;
  response:any;
  response1:any[]=[];
  response2:any[]=[];
  response3:any[]=[];
  response4:any[]=[];
  response5:any[]=[];
  response6:any[]=[];
  response7:any[]=[];
  response8:any[]=[];
  response9:any[]=[];
  response10:any[]=[];
  response11:any;
  response12:any;
  response13:any;
  response14:any;
  response15:any;
  response16:any;
  response17:any;
  selectedItem:any;
  selectedItem1:any;
  selectedItem2:any;
  selectedItem3:any;
  selectedItem4:any;
  statename:string='';
  districtname:string='';
  talukname:string='';

  
   async country(data:any){
    console.log(data);
     this.response=await this.as.countryAdd(data)
    console.log(`in admin.component.ts ${this.response.COUNTRYCODE}`);
  }
  async countryList(){
    // console.log(data);
    try{
      const result = await this.as.countryList();
     this.response1=result as any[];
    console.log(`in admin.component.ts ${this.response1}`);
    }catch(error){console.error(`Error in countryList:`, error);}
  }

  async state(data:any){
    console.log(data);
    const statename = data.statename;
    const selectedItem = data.selectedItem.countrycode;
    console.log(statename);
    console.log(selectedItem);
     this.response=await this.as.stateAdd({ statename, selectedItem })
    console.log(`in admin.component.ts ${this.response.STATECODE}`);
  }
  async stateList(){
    // console.log(data);
    try{
      const result = await this.as.stateList();
     this.response2=result as any[];
    console.log(`in signin.component.ts ${this.response2}`);
    }catch(error){console.error(`Error in countryList:`, error);}
  }
  async byCountryCode() {
    const countrycode = this.selectedItem1?.countrycode;
    if (countrycode) {
        console.log(`Selected Country Code: ${countrycode}`);
        const result = await this.as.stateListByCountry(countrycode);
        this.response4 = result as any[];
        console.log(this.response4)
    } else {
        console.log('Country code is null or undefined.');
    }
}

 
  async district(data:any){
    console.log(data);
    const districtname = data.districtname;
    const selectedItem1 = data.selectedItem1.countrycode;
    const selectedItem2 = data.selectedItem2.statecode;
    this.response=await this.as.districtAdd({ districtname, selectedItem1, selectedItem2 })
    console.log(`in signin.component.ts ${this.response.DISTRICTCODE}`);
  }
  async districtList(){
    // console.log(data);
    try{
      const result = await this.as.districtList();
     this.response3=result as any[];
    console.log(`in signin.component.ts ${this.response3}`);
    }catch(error){console.error(`Error in countryList:`, error);}
  }
  async byStateCode() {
    const statecode = this.selectedItem2?.statecode;
    if (statecode) {
        console.log(`Selected Country Code: ${statecode}`);
        const result = await this.as.districtListByState(statecode);
        this.response6 = result as any[];
        console.log(this.response6)
    } else {
        console.log('Country code is null or undefined.');
    }
}


async taluk(data:any){
  console.log(`in component${data}`);
  const talukname = data.talukname;
  const selectedItem13 = data.selectedItem3.districtcode;
  const selectedItem11 = data.selectedItem1.countrycode;
  const selectedItem12 = data.selectedItem2.statecode;
  this.response=await this.as.TalukAdd({talukname, selectedItem13, selectedItem11, selectedItem12 })
  console.log(`in signin.component.ts ${this.response.TALUK}`);
}
async talukList(){
  // console.log(data);
  try{
    const result = await this.as.talukList();
   this.response7=result as any[];
  console.log(`in signin.component.ts ${this.response7}`);
  }catch(error){console.error(`Error in countryList:`, error);}
}
async byDistrictCode() {
  const districtcode = this.selectedItem3?.districtcode;
  if (districtcode) {
      console.log(`Selected Country Code: ${districtcode}`);
      const result = await this.as.talukListByDistrict(districtcode);
      this.response10 = result as any[];
      console.log(this.response10)
  } else {
      console.log('Country code is null or undefined.');
  }
}

async job(data:any){
  console.log(`in component${data}`)
  this.response=await this.as.jobAdding(data);
  console.log(`data returned${this.response}`)
}
async jobList(){
  // console.log(data);
  try{
    const result = await this.as.jobList();
   this.response8=result as any[];
  console.log(`in signin.component.ts ${this.response8}`);
  }catch(error){console.error(`Error in countryList:`, error);}
}


async commission(data:any){
  console.log(`in commission component${data}`)
  this.response=await this.as.commissionAdding(data);
  console.log(`data returned${this.response}`)
}
async commissionList(){
  // console.log(data);
  try{
    const result = await this.as.commissionListing();
   this.response9=result as any[];
  console.log(`in signin.component.ts ${this.response9}`);
  }catch(error){console.error(`Error in countryList:`, error);}
}
async showAdminName(){
  const adminid = this.adminid;
  this.response11=await this.as.showAdminName(adminid);
}
async showAddress(){
  const adminid= this.adminid;
  this.response12=await this.as.showAddress(adminid);
}
async showBanking(){
  const adminid= this.adminid;
  this.response13=await this.as.showBanking(adminid);
}
async showIdentity(){
  const adminid= this.adminid;
  this.response14=await this.as.showIdentity(adminid);
}
async showPersonal(){
  const adminid=this.adminid;
  this.response14=await this.as.showPersonal(adminid);
}
async editAdminName(data:any){
  const adminid=this.adminid;
  const firstname=data.firstname;
  const middlename=data.middlename;
  const lastname=data.lastname;
  this.response=await this.as.editAdminName({adminid,firstname,middlename,lastname}) ;
}
async editAddress(data:any){
  const addressid= this.adminid;
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
  const bankid= this.adminid;
  const bank=data.bank;
  const branch=data.branch;
  const ifsc =data.ifsc;
  const accountnumber=data.accountnumber;
  const secretpin=data.secretpin;
  const upiid=data.upiid;
  this.response=await this.as.editBanking({bankid,bank,branch,ifsc,accountnumber,secretpin,upiid});
}
async editIdentity(data:any){
  const identityid= this.adminid;
  const adhar=data.adhar;
  const pancard=data.pancard;
  const electionid=data.electionid;
  this.response=await this.as.editIdentity({identityid,adhar,pancard,electionid});
}
async editPersonal(data:any){
  const personalid=this.adminid;
  const age=data.age;
  const dateofbirth=data.dateofbirth;
  const gender=data.gender;
  const father=data.father;
  const mother=data.mother;
  const spouse=data.spouse;
  const children=data.children;
  this.response=await this.as.editPersonal({personalid,age,dateofbirth,gender,father,mother,spouse,children});
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
  activate4Div(divNumber: number): void {
    this.active4Div = divNumber;
  }
  activate41Div(divNumber: number): void {
    this.active41Div = divNumber;
  }
  activate42Div(divNumber: number): void {
    this.active42Div = divNumber;
  }
  activate43Div(divNumber: number): void {
    this.active43Div = divNumber;
  }
  activate44Div(divNumber: number): void {
    this.active44Div = divNumber;
  }
  activate5Div(divNumber: number): void {
    this.active5Div = divNumber;
  }
}
