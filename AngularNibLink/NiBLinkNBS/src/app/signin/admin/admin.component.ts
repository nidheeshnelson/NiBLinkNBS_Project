import { Component, NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {FormsModule} from '@angular/forms';
import {AdminService} from './admin.service';

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
  response:any;
  response1:any[]=[];
  response2:any[]=[];
  selectedItem:any;
  statename:string='';
  
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
}
