import { Component } from '@angular/core';
import {FormsModule} from '@angular/forms';
import {CustomerService} from '../customer.service';
@Component({
  selector: 'app-customersignup',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './customersignup.component.html',
  styleUrl: './customersignup.component.css'
})
export class CustomersignupComponent {
  constructor(private cs:CustomerService){}
  async register(data:any){
    console.log(data);
    
    let response:any=await this.cs.signUpCustomer(data)
    console.log(response);
  }
}
