import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from '@angular/material/dialog';
import {CustomerService} from '../../service/customer.service';

@Component({
  selector: 'app-delete-customer',
  templateUrl: './delete-customer.component.html',
  styleUrls: ['./delete-customer.component.css']
})
export class DeleteCustomerComponent implements OnInit {
  customerFullname: string;
  customerID: number;
  constructor(
    public dialogDel: MatDialogRef<DeleteCustomerComponent>,
    @Inject(MAT_DIALOG_DATA) public data: any,
    public customerService: CustomerService
  ) {}


  ngOnInit(): void {
    this.customerFullname = this.data.data1.name;
    this.customerID = this.data.data1.id;
  }

  deleteCustomer() {
    this.customerService.deleteCustomer(this.customerID).subscribe(data => {
      this.dialogDel.close();
    });
  }
}
