import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent {
  // Formgroup variable registerForm with formcontrol variables username, email, password, and confirmPassword, address, city, state, zip
  registerForm = new FormGroup({
    username: new FormControl(''),
    email: new FormControl(''),
    password: new FormControl(''),
    confirmPassword: new FormControl(''),
    address: new FormControl(''),
    city: new FormControl(''),
    state: new FormControl(''),
    zip: new FormControl(''),
  });

  // Function onSubmit
  onSubmit() {
    console.log(this.registerForm.value);
    // if password and confirmPassword are not equal, alert user
    if (this.registerForm.value.password != this.registerForm.value.confirmPassword) {
      alert("Passwords do not match");
      return;
    }
    //post http api call to submit registerForm value
    this.http.post('http://localhost:3000/register', this.registerForm.value).subscribe((response) => {
      console.log('response', response);
    } );
  }

    //constructor
    constructor(private http: HttpClient) { }
}
