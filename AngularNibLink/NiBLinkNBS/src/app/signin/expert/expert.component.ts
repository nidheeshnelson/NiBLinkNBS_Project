import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
@Component({
  selector: 'app-expert',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './expert.component.html',
  styleUrl: './expert.component.css'
})
export class ExpertComponent {
  activeDiv: number | null = null; // Variable to track active div, initially set to null
  active1Div: number | null = null;
  activateDiv(divNumber: number): void {
    this.activeDiv = divNumber;
  }
  activate1Div(divNumber: number): void {
    this.active1Div = divNumber;
  }
}
