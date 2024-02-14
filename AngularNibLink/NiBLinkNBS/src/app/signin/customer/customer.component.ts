import { Component, Input } from '@angular/core';
import { CommonModule } from '@angular/common';
import {CustomerService} from './customer.service';
@Component({
  selector: 'app-customer',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './customer.component.html',
  styleUrl: './customer.component.css'
})
export class CustomerComponent {
  @Input() customerResponse: any;
  customerid: string;
  constructor(private cs:CustomerService){
    this.customerid = this.customerResponse?.ID;
  }
  activeDiv: number | null = null; // Variable to track active div, initially set to null

  activateDiv(divNumber: number): void {
    this.activeDiv = divNumber;
  }
}
