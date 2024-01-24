import { Component } from '@angular/core';
import {FormsModule} from '@angular/forms';
import {ExpertService} from '../expert.service';

@Component({
  selector: 'app-expertsignup',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './expertsignup.component.html',
  styleUrl: './expertsignup.component.css'
})
export class ExpertsignupComponent {
  constructor(private es:ExpertService){}
  async register(data:any){
    console.log(data);
    
    let response:any=await this.es.signUpExpert(data)
    console.log(response);
  }
}
