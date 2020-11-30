import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  public API = 'http://localhost:3000/employees';
  constructor(
    public http: HttpClient
  ) { }
  getAllEmployee(): Observable<any>{
    return this.http.get(this.API);
  }
  AddNewEmployee(employee): Observable<any>{
    return this.http.post(this.API, employee);
  }
  deleteEmployee(idEmployeeDel): Observable<any>{
    return this.http.delete(this.API + '/' + idEmployeeDel);
  }
  findEmployeeByID(idEmployee): Observable<any>{
    return this.http.get(this.API + '/' + idEmployee);
  }
  editEmployee(employee, employeeID): Observable<any>{
    return this.http.put(this.API + '/' + employeeID, employee);
  }
}
