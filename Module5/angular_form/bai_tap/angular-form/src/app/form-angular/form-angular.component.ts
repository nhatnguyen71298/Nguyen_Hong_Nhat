import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormControl, FormGroup, Validators} from '@angular/forms';

@Component({
  selector: 'app-form-angular',
  templateUrl: './form-angular.component.html',
  styleUrls: ['./form-angular.component.css']
})


export class FormAngularComponent implements OnInit {
  public newStudent: FormGroup;
  idStudent: number;
  nameStudent: string;
  phoneStudent: string;
  statusStudent: string;
  constructor(public formStudent: FormBuilder ) { }

  ngOnInit(): void {
    this.newStudent = this.formStudent.group(
      {
        id: ['', [Validators.required]],
        name: ['', [Validators.minLength(5)]],
        phone: ['', [Validators.min(99999999)]],
        status: ['', [Validators.required]]
      }
    );
  }

  infoStudent() {
    this.idStudent = this.newStudent.value.id;
    this.nameStudent = this.newStudent.value.name;
    this.phoneStudent = this.newStudent.value.phone;
    this.statusStudent = this.newStudent.value.status;
  }
}
