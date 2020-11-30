import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from '@angular/material/dialog';
import {CarsService} from '../../service/cars.service';

@Component({
  selector: 'app-delete-car',
  templateUrl: './delete-car.component.html',
  styleUrls: ['./delete-car.component.css']
})
export class DeleteCarComponent implements OnInit {
  carNumber: string;
  carID: number;
  constructor(
    public dialogDel: MatDialogRef<DeleteCarComponent>,
    @Inject(MAT_DIALOG_DATA) public data: any,
    public carService: CarsService
  ) {}


  ngOnInit(): void {
    this.carNumber = this.data.data1.numberCar;
    this.carID = this.data.data1.id;
  }

  deleteCar() {
    this.carService.deleteCar(this.carID).subscribe(data => {
      this.dialogDel.close();
    });
  }
}
