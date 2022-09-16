import { Component, OnInit } from '@angular/core';
import { AuthResponse } from 'src/app/models/auth-response';
import { User } from 'src/app/models/user';
import { AuthService } from 'src/app/services/auth.service';
import { UserService } from 'src/app/services/user.service';

@Component({
  selector: 'app-users',
  templateUrl: './users.component.html',
  styleUrls: ['./users.component.scss'],
})
export class UsersComponent implements OnInit {
  constructor(private userSrv: UserService, private auth:AuthService) {}

  allUsers!: User[];
  actualUserId: string = String(this.auth.getLoggedUser().user.id)


  ngOnInit(): void {
    this.userSrv.getAllUsers().subscribe({
      next: (res) => {
        this.allUsers = res;
      },
      error: (error) => console.log(error),
    });



  }




  deleteUser(user: User): void {
    if (user.id) {
      this.userSrv.deleteUser(user).subscribe(() => {
        let index: number = this.allUsers.findIndex((p) => p.id === user.id);
        this.allUsers.splice(index, 1);
      });
    }
  }
}
