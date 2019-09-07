import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Customer } from '../customer';
import { CustomerService } from '../customer.service';

@Component({
  selector: 'app-customer-list',
  templateUrl: './customer-list.component.html',
  styleUrls: ['./customer-list.component.css']
})
export class CustomerListComponent implements OnInit {

  customers: Customer[];
  interval: any;
  searchText: string;
  constructor(private customerService: CustomerService) { }
  ngOnInit() {
    this.reloadData();
     this.interval = setInterval(()=>{
       this.reloadData();
     },15000);
  }

  reloadData(){
     this.customerService.getCustomerList().subscribe(data=>{
      this.customers = data;
    });
    
  }

}
