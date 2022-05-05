import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
// import { Register } from './todo/Register';

@Injectable({
  providedIn: 'root'
})
export class RegisterService {

     constructor(private http : HttpClient) { }
  //    public getval(reg:Register){
  //     return this.http.post("http://localhost:8080/add",reg)
  //  }
}
