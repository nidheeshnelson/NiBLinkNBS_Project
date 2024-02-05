import { Component } from '@angular/core';
import {CommonModule} from '@angular/common';
import {FormsModule} from '@angular/forms';
import {LoginService} from './login.service';
import {AdminComponent} from '../signin/admin/admin.component';
import {ExpertComponent} from '../signin/expert/expert.component';
import {CustomerComponent} from '../signin/customer/customer.component';



@Component({
  selector: 'app-signin',
  standalone: true,
  imports: [CommonModule, FormsModule, AdminComponent, CustomerComponent, ExpertComponent],
  templateUrl: './signin.component.html',
  styleUrl: './signin.component.css'
})
export class SigninComponent {
  // response: Map<number, string> = new Map<number, string>();
  
  constructor(private ls:LoginService){}
  isLoggedIn:boolean= false;
  // loggedInContent:any='';

  response:any;
   async login(data:any){
    console.log(data);
     this.response=await this.ls.logIn(data)
    console.log(this.response);
  }
  checkFirstLetters1(str: string): boolean {
    this.isLoggedIn= true;
    return str.substring(0, 1) === 'A';
  }
  checkFirstLetters2(str: string): boolean {
    this.isLoggedIn= true;
    return str.substring(0, 1) === 'E';
  }
  checkFirstLetters3(str: string): boolean {
    this.isLoggedIn= true;
    return str.substring(0, 1) === 'C';
  }
  
}
