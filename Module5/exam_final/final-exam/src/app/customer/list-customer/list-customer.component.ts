import { Component, OnInit } from '@angular/core';
import {CustomerService} from '../../../../src/app/service/customer.service';
import {MatDialog} from '@angular/material/dialog';
import {DeleteCustomerComponent} from '../delete-customer/delete-customer.component';
@Component({
  selector: 'app-list-customer',
  templateUrl: './list-customer.component.html',
  styleUrls: ['./list-customer.component.css']
})
export class ListCustomerComponent implements OnInit {
  customers: any;
  p: any;
  term: any;

  constructor(
    public customerService: CustomerService,
    public diaLog: MatDialog
  ) { }

  ngOnInit(): void {
   this.customers =  Array.of(this.customerService.getAllCustomer().subscribe(data => {
     this.customers = data;
   }));
  }

  openDialogDel(id: number) {
      this.customerService.findCustomerByID(id).subscribe(dataOfCustomer => {
        const dialogDel = this.diaLog.open(DeleteCustomerComponent, {
          width: '500px',
          data: {data1: dataOfCustomer},
          disableClose: true
        });
        dialogDel.afterClosed().subscribe(result => {
          this.ngOnInit();
        });
      });
  }
}
