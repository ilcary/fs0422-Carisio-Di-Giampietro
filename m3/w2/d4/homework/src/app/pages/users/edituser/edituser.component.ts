import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { User } from 'src/app/class/user';
import { UserSrvService } from 'src/app/services/user-srv.service';

@Component({
  selector: 'app-edituser',
  templateUrl: './edituser.component.html',
  styleUrls: ['./edituser.component.css'],
})
export class EdituserComponent implements OnInit {
  constructor(
    private userSvc: UserSrvService,
    private route: ActivatedRoute,
    private router: Router
  ) {}

  currentUser!: User;

  ngOnInit(): void {
    let userId: number = Number(this.route.snapshot.paramMap.get('id'));
    let user: User | null = this.userSvc.getUserById(userId);
    if (user) {
      this.currentUser = user;
    } else {
      this.router.navigate(['/user']);
    }
  }

  save(): void {
    this.userSvc.editUser(this.currentUser);
    this.router.navigate(['/users']);
  }
}
