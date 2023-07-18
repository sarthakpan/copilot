import { Component } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';
//import httpclientmodule
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {

  // Formgroup variable loginForm with formcontrol variables username and password
  loginForm = new FormGroup({
    username: new FormControl(''),
    password: new FormControl(''),
  });

  // Function onSubmit
  onSubmit() {
    console.log(this.loginForm.value);
    //post http api call to submit loginForm value
    this.http.post('http://localhost:3000/login', this.loginForm.value).subscribe((response) => {
      console.log('response', response);
    } );


  }

  //constructor
  constructor(private http: HttpClient) { }
}
