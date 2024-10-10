import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { SignupComponent } from './auth/components/signup/signup.component';
import { LoginComponent } from './auth/components/login/login.component';
import { HomeComponent } from './home/home.component';

const routes: Routes = [
  { path: "register", component: SignupComponent },
  { path: "login", component: LoginComponent },
  { path: "home", component: HomeComponent },

  { path: '', redirectTo: '/login', pathMatch: 'full' }
];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {

}
