import { Component, OnInit } from '@angular/core';
import {MatDialog} from '@angular/material/dialog';
import {CarsService} from '../../service/cars.service';
import {DeleteCarComponent} from '../delete-car/delete-car.component';

@Component({
  selector: 'app-list-car',
  templateUrl: './list-car.component.html',
  styleUrls: ['./list-car.component.css']
})
export class ListCarComponent implements OnInit {
  cars: any;
  p: any;

  constructor(
    public carService: CarsService,
    public diaLog: MatDialog
  ) { }

  ngOnInit(): void {
    this.cars =  Array.of(this.carService.getAllCar().subscribe(data => {
      this.cars = data;
    }));
  }

  openDialogDel(id: number) {
    this.carService.findCarByID(id).subscribe(dataOfCar => {
      const dialogDel = this.diaLog.open(DeleteCarComponent, {
        width: '500px',
        data: {data1: dataOfCar},
        disableClose: true
      });
      dialogDel.afterClosed().subscribe(result => {
        this.ngOnInit();
      });
    });
  }
}
