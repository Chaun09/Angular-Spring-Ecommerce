import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
// import { AdminComponent } from './modules/admin/admin/admin.component';
import { CustomerComponent } from './modules/customer/components/customer/customer.component';
// import { HomeComponent } from './home/home/home.component';
import { SignupComponent } from './auth/components/signup/signup.component';
import { HttpClientModule } from '@angular/common/http';
import { LoginComponent } from './auth/components/login/login.component';
import { AdminService } from './modules/admin/services/admin.service';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HeaderComponent } from './modules/customer/header/header.component';
import { FooterComponent } from './modules/customer/footer/footer.component';
import { MidFooterComponent } from './modules/customer/mid-footer/mid-footer.component';




@NgModule({
  declarations: [

    AppComponent,
    SignupComponent,
    LoginComponent

  ],
  imports: [
    FormsModule,
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    ReactiveFormsModule
  ],
  providers: [AdminService],
  bootstrap: [AppComponent]
})
export class AppModule { }
