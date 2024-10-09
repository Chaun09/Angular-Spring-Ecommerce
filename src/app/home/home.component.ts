import { Component } from '@angular/core';
import { AdminDashboardComponent } from '../modules/admin/components/admin/admin.component';

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [
    AdminDashboardComponent
  ],
  templateUrl: './home.component.html',
  styleUrl: './home.component.scss'
})
export class HomeComponent {

}
