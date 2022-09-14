import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AuthComponent } from './auth/auth.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';

const routes: Routes = [
  {
    path: '',// -> /login
    component:AuthComponent,
    children: [
      {
        path: '',
        component:LoginComponent
      },
      {
        path: 'register',
        component:RegisterComponent
      }
    ]
  },
  {
    path: 'login',
    redirectTo: '/'
  }

];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class AuthRoutingModule { }
