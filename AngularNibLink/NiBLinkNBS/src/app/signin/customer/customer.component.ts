import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
@Component({
  selector: 'app-customer',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './customer.component.html',
  styleUrl: './customer.component.css'
})
export class CustomerComponent {
  activeDiv: number | null = null; // Variable to track active div, initially set to null

  activateDiv(divNumber: number): void {
    this.activeDiv = divNumber;
  }
}
