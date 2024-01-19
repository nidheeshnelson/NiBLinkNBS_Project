import {RouterModule, Routes } from '@angular/router';
import {NgModule} from '@angular/core';
import {HomeComponent} from './home/home.component';
import {SignupComponent} from './signup/signup.component';
import {SigninComponent} from './signin/signin.component';

const routes:Routes =[
{path:'home', component:HomeComponent},
{path:'signup', component:SignupComponent},
{path:'signup', component:SigninComponent},
{path:'', redirectTo:'/home', pathMatch:'full'},
];
@NgModule({
    imports:[RouterModule.forRoot(routes)],
    exports:[RouterModule],
})
export class AppRoutingModule{}
