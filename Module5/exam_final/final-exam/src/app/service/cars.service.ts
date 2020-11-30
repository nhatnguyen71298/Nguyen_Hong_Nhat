import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CarsService {
  public API = 'http://localhost:3000/cars';
  constructor(
    public http: HttpClient
  ) { }
  getAllCar(): Observable<any>{
    return this.http.get(this.API);
  }
  AddNewCar(car): Observable<any>{
    return this.http.post(this.API, car);
  }
  deleteCar(idCar): Observable<any>{
    return this.http.delete(this.API + '/' + idCar);
  }
  findCarByID(idCar): Observable<any>{
    return this.http.get(this.API + '/' + idCar);
  }
  editCar(car, idCar): Observable<any>{
    return this.http.put(this.API + '/' + idCar, car);
  }
}
