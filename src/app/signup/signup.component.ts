import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup,} from '@angular/forms';
import { Register } from '../todo/Register';
import { RegisterService } from '../register.service';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.scss']
})
  
export class SignupComponent implements OnInit {
  msg:any
  public signupForm !: FormGroup;
  public reg : Register = new Register("","","","")
  constructor(private formBuilder: FormBuilder, private rs : RegisterService, private http:HttpClient) { }

  ngOnInit(): void {
    this.signupForm = this.formBuilder.group({
      fullname: [''],
      emailaddress: [''],
      password: [''],
      mobilenumber: ['']
    })
    console.log(this.signupForm)
  }
  onSubmit(){
    this.http.post<any>("http://localhost:8080/add",this.signupForm.value).subscribe(res=>{
    },err=>{
      console.log(err)
    })
  }


}
