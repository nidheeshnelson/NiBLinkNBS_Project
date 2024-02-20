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
  selectedItem:any;
  selectedItem1:any;
  selectedItem2:any;
  selectedItem3:any;
  selectedItem4:any;
  selectedItem5:any;
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
