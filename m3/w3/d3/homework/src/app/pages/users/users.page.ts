import { Component, OnInit } from '@angular/core';
import { User } from '../../models/user';
import { UsersService } from './users.service';


@Component({
  template: `
    <div class="container mt-4">
      <ul class="list-group">
        <li [routerLink]="[user.id]" routerLinkActive="active"   class="list-group-item" *ngFor="let user of users">
          {{ user.name }}
        </li>
      </ul>
      <hr />
      <router-outlet></router-outlet>
    </div>
  `,
  styles: [],
})
export class UsersPage implements OnInit {
  users!: User[];
  constructor(private usersSrv: UsersService) {}

  ngOnInit(): void {
    this.users = this.usersSrv.getUsers();
  }
}
