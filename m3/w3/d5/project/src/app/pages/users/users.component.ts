import { Component, OnInit } from '@angular/core';
import { User } from 'src/app/models/user';
import { UserService } from 'src/app/services/user.service';

@Component({
  selector: 'app-users',
  templateUrl: './users.component.html',
  styleUrls: ['./users.component.scss']
})
export class UsersComponent implements OnInit {

  constructor(private userSrv: UserService) { }

  allUsers: User[] = this.userSrv.getAllUsers();

  ngOnInit(): void {
  }

  deleteUser(user: User): void {
    if(user.id){
      this.userSrv.deleteUser(user.id);
      this.allUsers = this.userSrv.getAllUsers()
    }
  }

}
