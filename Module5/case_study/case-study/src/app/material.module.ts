import {AddCustomerComponent} from './customer/add-customer/add-customer.component';
import {ListCustomerComponent} from './customer/list-customer/list-customer.component';
import {NgModule} from '@angular/core';
import {MatDialogModule} from '@angular/material/dialog';


@NgModule({
  imports: [
    MatDialogModule
  ],
  exports: [
    MatDialogModule
  ]
})
export class MaterialModule { }
