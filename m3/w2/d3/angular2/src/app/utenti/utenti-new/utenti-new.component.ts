import { Component, OnInit } from '@angular/core';
import { User } from 'src/app/user';
import { UserService } from 'src/app/user.service';

@Component({
  selector: 'app-utenti-new',
  templateUrl: './utenti-new.component.html',
  styleUrls: ['./utenti-new.component.scss']
})
export class UtentiNewComponent implements OnInit {

  constructor(private userSvc: UserService) { }

  newUser:User = new User('','');

  ngOnInit(): void {
  }

  save(){
    this.userSvc.addNewUser(this.newUser)
  }

}
