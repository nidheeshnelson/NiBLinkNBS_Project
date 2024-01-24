import { Component } from '@angular/core';
import {FormsModule} from '@angular/forms';
import {AdminService} from '../admin.service';
import { log } from 'console';

@Component({
  selector: 'app-adminsignup',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './adminsignup.component.html',
  styleUrl: './adminsignup.component.css'
})
export class AdminsignupComponent {
constructor(private as:AdminService){}
async register(data:any){
  console.log(data);
  
  let response:any=await this.as.signUpAdmin(data)
  console.log(response);
}
}
