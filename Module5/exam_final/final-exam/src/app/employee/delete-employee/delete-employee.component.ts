import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from '@angular/material/dialog';
import {EmployeeService} from '../../service/employee.service';

@Component({
  selector: 'app-delete-employee',
  templateUrl: './delete-employee.component.html',
  styleUrls: ['./delete-employee.component.css']
})
export class DeleteEmployeeComponent implements OnInit {
  employeeFullname: string;
  employeeID: number;
  constructor(
    public dialogDel: MatDialogRef<DeleteEmployeeComponent>,
    @Inject(MAT_DIALOG_DATA) public data: any,
    public employeeService: EmployeeService
  ) {}


  ngOnInit(): void {
    this.employeeFullname = this.data.data1.name;
    this.employeeID = this.data.data1.id;
  }

  deleteEmployee() {
    this.employeeService.deleteEmployee(this.employeeID).subscribe(data => {
      this.dialogDel.close();
    });
  }
}
