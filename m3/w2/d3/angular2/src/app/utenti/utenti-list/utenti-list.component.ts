import { Component, OnInit } from '@angular/core';
import { User } from 'src/app/user';
import { UserService } from 'src/app/user.service';

@Component({
  selector: 'app-utenti-list',
  templateUrl: './utenti-list.component.html',
  styleUrls: ['./utenti-list.component.scss']
})
export class UtentiListComponent implements OnInit {

  constructor(private userSvc: UserService) { }

  allUsers:User[] = []

  ngOnInit(): void {
    this.allUsers = this.userSvc.allUsers;
  }

  deleteUser(id:string | number | undefined){
    if(id){
      this.userSvc.deleteUser(id)
    }
  }

}
