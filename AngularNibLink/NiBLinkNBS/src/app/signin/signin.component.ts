import { Component} from '@angular/core';
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
  
  constructor(private ls:LoginService){}
  isLoggedIn:boolean= false;
  showoff:boolean= true;
  response:any;
  
   async login(data:any){
    console.log(data);
     this.response=await this.ls.logIn(data)
    console.log(`in signin.component.ts ${this.response.ID}`);
    this.isLoggedIn = true;
  }

  logout() {
    // Implement a logout method and reset the isLoggedIn flag
    this.isLoggedIn = false;
  }
  

  checkFirstLetters1(str: string): boolean {
    console.log("in admin");
    // this.isLoggedIn= true;
    this.showoff=false;
    return str.substring(0, 1) === 'A';
  }
  checkFirstLetters2(str: string): boolean {
    console.log("in expert");
    // this.isLoggedIn= true;
    this.showoff=false;
    return str.substring(0, 1) === 'E';
  }
  checkFirstLetters3(str: string): boolean {
    console.log("in customer");
    // this.isLoggedIn= true;
    this.showoff=false;
    return str.substring(0, 1) === 'C';
  }
  
}
