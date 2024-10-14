import { CustomerService } from './../../services/customer.service';
import { Component } from '@angular/core';
import { FooterComponent } from '../../footer/footer.component';
import { HeaderComponent } from '../../header/header.component';
import { MidFooterComponent } from '../../mid-footer/mid-footer.component';
import { NgFor } from '@angular/common';
import { MidHeadFooterComponent } from '../../mid-head-footer/mid-head-footer.component';


@Component({
  selector: 'app-customer',
  standalone: true,
  imports: [
    FooterComponent,
    HeaderComponent,
    MidFooterComponent,
    MidHeadFooterComponent,
    NgFor

  ],
  templateUrl: './customer.component.html',
  styleUrl: './customer.component.scss'
})
export class CustomerComponent {
  products: any[] = [];


  isLoading: boolean = true;
  errorMessage: string = '';

  constructor(private CustomerService: CustomerService) { }

  ngOnInit(): void {

    this.CustomerService.showAllProducts().subscribe({
      next: (data) => {
        this.products = data;
        console.log(data);
      },
      error: (error) => {
        this.errorMessage = 'Error fetching customer data';
        console.log(error);
      }
    });
  }

}
