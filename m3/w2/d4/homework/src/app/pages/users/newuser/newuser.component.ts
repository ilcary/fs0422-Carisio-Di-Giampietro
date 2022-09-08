import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AppRoutingModule } from 'src/app/app-routing.module';
import { User } from 'src/app/class/user';
import { UserSrvService } from 'src/app/services/user-srv.service';

@Component({
  selector: 'app-newuser',
  templateUrl: './newuser.component.html',
  styleUrls: ['./newuser.component.css']
})
export class NewuserComponent implements AppRoutingModule {

  newUser: User= new User('','',new Date());

  constructor(private userSvc: UserSrvService , private router: Router) { }

  save(){
    this.userSvc.addUser(this.newUser)
    this.router.navigate(['/users']);
  }

}
