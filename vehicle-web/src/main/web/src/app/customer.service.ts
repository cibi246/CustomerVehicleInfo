import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  private baseUrl = 'customers';
 
  constructor(private http: HttpClient) { }

  getCustomer(id: number): Observable<Object>{
    return this.http.get(`${this.baseUrl}/${id}`);
  }

  getCustomerList(): Observable<any>{
    return this.http.get(`${this.baseUrl}`);
  }
}
