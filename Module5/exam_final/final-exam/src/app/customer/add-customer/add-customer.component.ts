import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {CustomerService} from '../../../../src/app/service/customer.service';
import {Router} from '@angular/router';

@Component({
  selector: 'app-add-customer',
  templateUrl: './add-customer.component.html',
  styleUrls: ['./add-customer.component.css']
})
export class AddCustomerComponent implements OnInit {
  public formAddNewCustomer: FormGroup;
  maxDate = new Date();
  // năm/tháng/ngày tháng bị trừ đi 1
  minDate = new Date(1990, 0, 1);
  constructor(
    public formBuilder: FormBuilder,
    private customerService: CustomerService,
    public route: Router
  ) { }

  ngOnInit(): void {
    this.formAddNewCustomer = this.formBuilder.group(
      {
        type: ['', Validators.required],
        name: ['', Validators.required],
        dateOfBirth: ['', Validators.required],
        idCard: ['', Validators.required],
        phoneNumber: ['', Validators.required],
        email: ['', Validators.required],
        address: ['', Validators.required]
      }
    );
  }

  addNewCustomer() {
    this.customerService.AddNewCustomer(this.formAddNewCustomer.value).subscribe(data => (
      this.route.navigateByUrl('customers')
    ));
  }
}
