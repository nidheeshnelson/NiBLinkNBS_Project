import { Component, Input } from '@angular/core';
import { CommonModule } from '@angular/common';
import {ExpertService} from './expert.service';
@Component({
  selector: 'app-expert',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './expert.component.html',
  styleUrl: './expert.component.css'
})
export class ExpertComponent {
  @Input() expertResponse: any;
  customerid: string;
  constructor(private es:ExpertService){
    this.customerid = this.expertResponse?.ID;
  }
  response:any;
  activeDiv: number | null = null; // Variable to track active div, initially set to null
  active1Div: number | null = null;
  active12Div: number | null = null;
  active2Div: number | null = null;

  async paymentrelated(data:any){
    const commissionid=data.selectedItem.generatedcommissionid;
    const paymentperhour=data.payment;
    const paymentid=this.customerid;
    this.response=await this.es.paymentDetails({paymentid,commissionid,paymentperhour});
    console.log(`in signin.component.ts ${this.response.STATECODE}`);
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
