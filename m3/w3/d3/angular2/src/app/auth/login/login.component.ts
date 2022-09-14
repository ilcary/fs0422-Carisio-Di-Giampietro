import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthService } from '../../auth.service';
import { ILogin } from '../Models/login';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {

  constructor(private auth:AuthService, private router:Router) { }

  ngOnInit(): void {
  }

  loginData:ILogin = {
    email:'luqujer@mailinator.com',
    password:'Pa$$w0rd!',
  }

  save(){
    this.auth.login(this.loginData)
    .subscribe(res=>{
        this.auth.saveAccessData(res)
        this.router.navigate(['/dashboard']);
    })
  }

}
