import { Routes } from '@angular/router';
import {HomeComponent} from './home/home.component';
import {SignupComponent} from './signup/signup.component';
import {SigninComponent} from './signin/signin.component';
import {AdminsignupComponent} from './signup/adminsignup/adminsignup.component';
import {ExpertsignupComponent} from './signup/expertsignup/expertsignup.component';
import {CustomersignupComponent} from './signup/customersignup/customersignup.component';
export const routes: Routes = [
    {path:'home', component:HomeComponent},
    {path:'signup', component:SignupComponent},
    {path:'signin', component:SigninComponent},
    {path:'admin', component:AdminsignupComponent},
    {path:'expert',component:ExpertsignupComponent},
    {path:'customer', component:CustomersignupComponent}
];
