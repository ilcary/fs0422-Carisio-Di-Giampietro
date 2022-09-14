import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { UsersPage } from './users.page';
import { UsersDetailsPage } from './users-details.page';
import { UsersRoutingModule } from './users-routing.module';



@NgModule({
  declarations: [
    UsersPage,
    UsersDetailsPage
  ],
  imports: [
    CommonModule,
    UsersRoutingModule,
  ]
})
export class UsersModule { }
