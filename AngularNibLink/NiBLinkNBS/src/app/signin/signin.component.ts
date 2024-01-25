import { Component } from '@angular/core';
import {CommonModule} from '@angular/common';
import {RouterOutlet} from '@angular/router';
import {FormsModule} from '@angular/forms';
import {LoginService} from './login.service';
@Component({
  selector: 'app-signin',
  standalone: true,
  imports: [CommonModule, RouterOutlet,FormsModule],
  templateUrl: './signin.component.html',
  styleUrl: './signin.component.css'
})
export class SigninComponent {
  constructor(private ls:LoginService){}
  async login(data:any){
    console.log(data);
    
    let response:any=await this.ls.logIn(data)
    console.log(response);
  }
}