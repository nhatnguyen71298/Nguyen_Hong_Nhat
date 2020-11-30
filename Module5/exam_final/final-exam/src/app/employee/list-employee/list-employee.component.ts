import { Component, OnInit } from '@angular/core';
import {MatDialog} from '@angular/material/dialog';
import {EmployeeService} from '../../service/employee.service';
import {DeleteCustomerComponent} from '../../customer/delete-customer/delete-customer.component';
import {DeleteEmployeeComponent} from '../delete-employee/delete-employee.component';
import {EditEmployeeComponent} from '../edit-employee/edit-employee.component';

@Component({
  selector: 'app-list-employee',
  templateUrl: './list-employee.component.html',
  styleUrls: ['./list-employee.component.css']
})
export class ListEmployeeComponent implements OnInit {
  employees: any;
  p: any;
  term: any;

  constructor(
    public employeeService: EmployeeService,
    public diaLog: MatDialog
  ) { }

  ngOnInit(): void {
    this.employees =  Array.of(this.employeeService.getAllEmployee().subscribe(data => {
      this.employees = data;
    }));
  }
  openDialogDel(id: number) {
    this.employeeService.findEmployeeByID(id).subscribe(dataOfEmployee => {
      const dialogDel = this.diaLog.open(DeleteEmployeeComponent, {
        width: '500px',
        data: {data1: dataOfEmployee},
        disableClose: true
      });
      dialogDel.afterClosed().subscribe(result => {
        this.ngOnInit();
      });
    });
  }

  openDialogEdit(id: number) {
    this.employeeService.findEmployeeByID(id).subscribe( dataOfEmployee => {
      console.log(dataOfEmployee);
      const dialogEdit = this.diaLog.open(EditEmployeeComponent, {
        width: '500px', height: '150%',
        data: {data1: dataOfEmployee},
        disableClose: true
      });
      dialogEdit.afterClosed().subscribe(result => {
        this.ngOnInit();
      });
    });
  }
}
