import { Component, OnInit } from '@angular/core';
import { User } from 'src/app/class/user';
import { UserSrvService } from 'src/app/services/user-srv.service';

@Component({
  selector: 'app-users',
  templateUrl: './users.component.html',
  styleUrls: ['./users.component.css']
})
export class UsersComponent implements OnInit {

  constructor(private userSvc: UserSrvService) { }

  allUsers: User[] = this.userSvc.getAllUsers();

  ngOnInit(): void {
  }

  deleteUser(user: User): void {
    if(user.id){
      this.userSvc.deleteUser(user.id);
      this.allUsers = this.userSvc.getAllUsers()
    }
  }
}
