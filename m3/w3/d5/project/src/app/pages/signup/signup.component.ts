import { Component } from '@angular/core';
import { UntypedFormBuilder, UntypedFormGroup, Validators } from '@angular/forms';
import { FormControl, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
import { AuthService } from 'src/app/services/auth.service';
import {CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';


@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.scss']
})
export class SignupComponent {


  form!: FormGroup

  constructor(
    private auth: AuthService,
    private router: Router
    ) { }

  ngOnInit(): void {
    this.form = new FormGroup({
      name: new FormControl(null, Validators.required),
      email: new FormControl(null, Validators.required),
      password: new FormControl(null, Validators.required)
    })
  }

  submit():void{
    this.auth.register(this.form.value)
    .subscribe(res => {
      console.log(res);
      this.auth.saveAccessData(res)
      alert(`User ${res.user.name} registered successfully`)
      this.form.reset();
      this.router.navigate(['/']);
    })
  }
}
