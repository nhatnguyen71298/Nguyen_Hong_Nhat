import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {Router} from '@angular/router';
import {EmployeeService} from '../../service/employee.service';

@Component({
  selector: 'app-add-employee',
  templateUrl: './add-employee.component.html',
  styleUrls: ['./add-employee.component.css']
})
export class AddEmployeeComponent implements OnInit {
  public formAddNewEmployee: FormGroup;
  maxDate = new Date();
  // năm/tháng/ngày tháng bị trừ đi 1
  minDate = new Date(1990, 0, 1);
  constructor(
    public formBuilder: FormBuilder,
    private employeeService: EmployeeService,
    public route: Router
  ) { }

  ngOnInit(): void {
    this.formAddNewEmployee = this.formBuilder.group(
      {
        name: ['', Validators.required],
        position: ['', Validators.required],
        dateOfBirth: ['', Validators.required],
        idCard: ['', Validators.required],
        phoneNumber: ['', Validators.required],
        email: ['', Validators.required],
        address: ['', Validators.required]
      }
    );
  }

  addNewEmployee() {
    this.employeeService.AddNewEmployee(this.formAddNewEmployee.value).subscribe(data => (
      this.route.navigateByUrl('employees')
    ));
  }
}
