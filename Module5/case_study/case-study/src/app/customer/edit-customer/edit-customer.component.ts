import {Component, EventEmitter, OnInit, Output} from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {CustomerService} from '../../service/customer.service';
import {ActivatedRoute, Router} from '@angular/router';

@Component({
  selector: 'app-edit-customer',
  templateUrl: './edit-customer.component.html',
  styleUrls: ['./edit-customer.component.css']
})
export class EditCustomerComponent implements OnInit {

  public formEditCustomer: FormGroup;
  customerID: number;
  constructor(
    public formBuilder: FormBuilder,
    private customerService: CustomerService,
    public route: Router,
    public activedRoute: ActivatedRoute
  ) { }

  ngOnInit(): void {
    this.formEditCustomer = this.formBuilder.group(
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
    this.activedRoute.params.subscribe(data => {
        this.customerID = data.id;
        this.customerService.findCustomerByID(this.customerID).subscribe(dataEdit => {
          this.formEditCustomer.patchValue(dataEdit);
        });
    });
  }


  editCustomer() {
    console.log(this.formEditCustomer.value);
    this.customerService.editCustomer(this.formEditCustomer.value, this.customerID).subscribe(data => {
      this.route.navigateByUrl('/customers');
    });
  }
}
