import { IRegister } from './../Models/register';
import { Component, OnInit } from '@angular/core';
import { AuthService } from '../../auth.service';


@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.scss']
})
export class RegisterComponent implements OnInit {

  constructor(private auth: AuthService) { }

  ngOnInit(): void {
  }


  registerData:IRegister = {
    email:'',
    password:'',
  }

  save(){
    this.auth.register(this.registerData)
    .subscribe(res => {
      alert(`utente ${res.user.email} registrato`)
    })
  }

}
