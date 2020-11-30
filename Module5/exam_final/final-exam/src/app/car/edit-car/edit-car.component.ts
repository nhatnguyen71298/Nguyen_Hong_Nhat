import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {ActivatedRoute, Router} from '@angular/router';
import {CarsService} from '../../service/cars.service';

@Component({
  selector: 'app-edit-car',
  templateUrl: './edit-car.component.html',
  styleUrls: ['./edit-car.component.css']
})
export class EditCarComponent implements OnInit {
  public formEditCar: FormGroup;
  carID: number;
  constructor(
    public formBuilder: FormBuilder,
    private carService: CarsService,
    public route: Router,
    public activedRoute: ActivatedRoute
  ) { }
  ngOnInit(): void {
    this.formEditCar = this.formBuilder.group(
      {
        numberCar: ['', Validators.required],
        type: ['', Validators.required],
        name: ['', Validators.required],
        goPlace: ['', Validators.required],
        toPlace: ['', Validators.required],
        phoneNumber: ['', [Validators.required, Validators.pattern('(090|093|097)\\d{7}')]],
        email: ['', [Validators.email, Validators.required]],
        timeGo: ['', [Validators.required, Validators.pattern('(0[5-9]|1\\d|2[0-2]):([0-5]\\d)|23:00')]],
        timeEnd: ['', [Validators.required, Validators.pattern('(0[5-9]|1\\d|2[0-2]):([0-5]\\d)|23:00')]],
      }
    );
    this.activedRoute.params.subscribe(data => {
      this.carID = data.id;
      this.carService.findCarByID(this.carID).subscribe(dataEdit => {
        this.formEditCar.patchValue(dataEdit);
      });
    });
  }

  updateCar() {
    this.carService.editCar(this.formEditCar.value, this.carID).subscribe(data => {
      this.route.navigateByUrl('/cars');
    });
  }
}

