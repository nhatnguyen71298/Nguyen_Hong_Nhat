import {Component, Inject, OnInit} from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {EmployeeService} from '../../service/employee.service';
import {MAT_DIALOG_DATA, MatDialogRef} from '@angular/material/dialog';
import {Router} from '@angular/router';

@Component({
  selector: 'app-edit-employee',
  templateUrl: './edit-employee.component.html',
  styleUrls: ['./edit-employee.component.css']
})
export class EditEmployeeComponent implements OnInit {

  public formEditEmployee: FormGroup;
  employeeID: number;
  maxDate = new Date();
  // năm/tháng/ngày tháng bị trừ đi 1
  minDate = new Date(1990, 0, 1);
  constructor(
    public dialogEdit: MatDialogRef<EditEmployeeComponent>,
    @Inject(MAT_DIALOG_DATA) public data: any,
    public formBuilder: FormBuilder,
    private employeeService: EmployeeService,
    public route: Router,
  ) { }

  ngOnInit(): void {
    this.formEditEmployee = this.formBuilder.group(
      {
        position: ['', Validators.required],
        name: ['', Validators.required],
        dateOfBirth: ['', Validators.required],
        idCard: ['', Validators.required],
        phoneNumber: ['', Validators.required],
        email: ['', Validators.required],
        address: ['', Validators.required]
      }
    );
    this.employeeID = this.data.data1.id;
    this.employeeService.findEmployeeByID(this.employeeID).subscribe(dataEdit => {
      this.formEditEmployee.patchValue(dataEdit);
    });
  }


  editEmployee() {
    this.employeeService.editEmployee(this.formEditEmployee.value, this.employeeID).subscribe(data => {
        this.dialogEdit.close();
    });
  }
}
