import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { SignupComponent } from './auth/components/signup/signup.component';
import { HttpClientModule } from '@angular/common/http';
import { LoginComponent } from './auth/components/login/login.component';
import { AdminService } from './modules/admin/services/admin.service';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HeaderComponent } from './modules/customer/header/header.component';
import { FaqComponent } from './faq/faq.component';
import { MidHeadFooterComponent } from './modules/customer/mid-head-footer/mid-head-footer.component';
import { FooterComponent } from './modules/customer/footer/footer.component';







@NgModule({
  declarations: [

    AppComponent,
    SignupComponent,
    LoginComponent,
    FaqComponent


  ],
  imports: [
    FormsModule,
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    ReactiveFormsModule,
    HeaderComponent,
    MidHeadFooterComponent,
    FooterComponent


  ],
  providers: [AdminService],
  bootstrap: [AppComponent]
})
export class AppModule { }
