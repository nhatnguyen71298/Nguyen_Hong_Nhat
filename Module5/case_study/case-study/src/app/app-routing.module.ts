import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {ListCustomerComponent} from './customer/list-customer/list-customer.component';
import {AddCustomerComponent} from './customer/add-customer/add-customer.component';
import {CommonModule} from '@angular/common';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {NgxPaginationModule} from 'ngx-pagination';
import { DeleteCustomerComponent } from './customer/delete-customer/delete-customer.component';
import {MatDialogModule} from '@angular/material/dialog';
import { EditCustomerComponent } from './customer/edit-customer/edit-customer.component';
import {MaterialModule} from './material.module';


const routes: Routes = [
  {path: 'customers', component: ListCustomerComponent},
  {path: 'customers_create', component: AddCustomerComponent},
  {path: 'customers_edit/:id', component: EditCustomerComponent},
];

@NgModule({
    imports: [
        RouterModule.forRoot(routes),
        CommonModule, FormsModule, ReactiveFormsModule, NgxPaginationModule, MatDialogModule, MaterialModule
    ],
  exports: [RouterModule],
  declarations: [AddCustomerComponent, ListCustomerComponent, DeleteCustomerComponent, EditCustomerComponent]
})
export class AppRoutingModule { }
