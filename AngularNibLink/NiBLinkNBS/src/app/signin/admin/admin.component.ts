import { Component} from '@angular/core';
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

  constructor(private as:AdminService){}
  activeDiv: number | null = null; // Variable to track active div, initially set to null
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
  selectedItem:any;
  selectedItem1:any;
  selectedItem2:any;
  selectedItem3:any;
  statename:string='';
  districtname:string='';
  talukname:string='';

  
   async country(data:any){
    console.log(data);
     this.response=await this.as.countryAdd(data)
    console.log(`in signin.component.ts ${this.response.COUNTRYCODE}`);
  }
  async countryList(){
    // console.log(data);
    try{
      const result = await this.as.countryList();
     this.response1=result as any[];
    console.log(`in signin.component.ts ${this.response1}`);
    }catch(error){console.error(`Error in countryList:`, error);}
  }

  async state(data:any){
    console.log(data);
    const statename = data.statename;
    const selectedItem = data.selectedItem.countrycode;
    console.log(statename);
    console.log(selectedItem);
     this.response=await this.as.stateAdd({ statename, selectedItem })
    console.log(`in signin.component.ts ${this.response.STATECODE}`);
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

  activateDiv(divNumber: number): void {
    this.activeDiv = divNumber;
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
