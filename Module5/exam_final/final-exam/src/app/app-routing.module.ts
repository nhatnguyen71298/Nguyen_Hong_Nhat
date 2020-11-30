import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {AddCustomerComponent} from './customer/add-customer/add-customer.component';
import {ListCustomerComponent} from './customer/list-customer/list-customer.component';
import {DeleteCustomerComponent} from './customer/delete-customer/delete-customer.component';
import {EditCustomerComponent} from './customer/edit-customer/edit-customer.component';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {MaterialModule} from './material.module';
import {NgxPaginationModule} from 'ngx-pagination';
import {CommonModule} from '@angular/common';
import { ListEmployeeComponent } from './employee/list-employee/list-employee.component';
import { EditEmployeeComponent } from './employee/edit-employee/edit-employee.component';
import { DeleteEmployeeComponent } from './employee/delete-employee/delete-employee.component';
import { AddEmployeeComponent } from './employee/add-employee/add-employee.component';
import {MatDialogModule} from '@angular/material/dialog';
import {Ng2SearchPipeModule} from 'ng2-search-filter';
import { ListCarComponent } from './car/list-car/list-car.component';
import { DeleteCarComponent } from './car/delete-car/delete-car.component';
import { EditCarComponent } from './car/edit-car/edit-car.component';


const routes: Routes = [
  {path: 'customers', component: ListCustomerComponent},
  {path: 'customers_create', component: AddCustomerComponent},
  {path: 'customers_edit/:id', component: EditCustomerComponent},
  {path: 'employees', component: ListEmployeeComponent},
  {path: 'employees_create', component: AddEmployeeComponent},
  {path: 'cars', component: ListCarComponent},
  {path: 'car_edit/:id', component: EditCarComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes),
    ReactiveFormsModule, FormsModule , CommonModule, MaterialModule, NgxPaginationModule, MatDialogModule, Ng2SearchPipeModule ],
  exports: [RouterModule, MatDialogModule],
  declarations: [AddCustomerComponent, ListCustomerComponent, DeleteCustomerComponent, EditCustomerComponent,
    ListEmployeeComponent, EditEmployeeComponent, DeleteEmployeeComponent, AddEmployeeComponent,
    ListCarComponent,
    DeleteCarComponent,
    EditCarComponent],
})
export class AppRoutingModule { }
