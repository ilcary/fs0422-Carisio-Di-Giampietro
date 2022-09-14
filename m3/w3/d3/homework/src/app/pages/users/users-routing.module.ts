import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { UsersPage } from './users.page';
import { UsersDetailsPage } from './users-details.page';
import { AuthGuard } from 'src/app/auth.guard';

const routes: Routes = [
  {
    path: "",
    component: UsersPage,
  },
  {
    path: "details:id",
    component: UsersDetailsPage,
    canActivate: [AuthGuard]
  }


]

@NgModule({

  imports: [
    RouterModule.forChild(routes)
  ],
  exports: [
    RouterModule
  ]
})
export class UsersRoutingModule { }
