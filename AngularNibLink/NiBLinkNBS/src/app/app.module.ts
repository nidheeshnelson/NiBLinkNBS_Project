import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {HomeComponent} from './home/home.component';
import {SignupComponent} from './signup/signup.component';
import {SigninComponent} from './signin/signin.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    SignupComponent,
    SigninComponent
  ],
  imports: [BrowserModule, AppRoutingModule],
  providers:[],
  bootstrap:[AppComponent]
})
export class AppModule { }
