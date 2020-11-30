import { Injectable } from '@angular/core';
import {HttpClient } from '@angular/common/http';
import {Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class CustomerService {
  public API = 'http://localhost:3000/customers';
  constructor(
    public http: HttpClient
  ) { }
  getAllCustomer(): Observable<any>{
    return this.http.get(this.API);
  }
  AddNewCustomer(customer): Observable<any>{
    return this.http.post(this.API, customer);
  }
  deleteCustomer(idCustomerDel): Observable<any>{
    return this.http.delete(this.API + '/' + idCustomerDel);
  }
  findCustomerByID(idCustomer): Observable<any>{
    return this.http.get(this.API + '/' + idCustomer);
  }
  editCustomer(customer, customerID): Observable<any>{
    return this.http.put(this.API + '/' + customerID, customer);
  }
}
