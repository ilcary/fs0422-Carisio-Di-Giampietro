import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

const routes: Routes = [
  { path: '', pathMatch: 'full', redirectTo: '/welcome' },
  { path: 'welcome', loadChildren: () => import('./pages/welcome/welcome.module').then(m => m.WelcomeModule) },
  { path: 'users', loadChildren: () => import('./pages/users/users.module').then(m => m.UsersModule) },
  { path: 'posts', loadChildren: () => import('./pages/posts/posts.module').then(m => m.PostsModule) },
  { path: 'login', loadChildren: () => import('./pages/login/login.module').then(m => m.LoginModule) },
  { path: 'signup', loadChildren: () => import('./pages/signup/signup.module').then(m => m.SignupModule) },
  { path: 'inactivePost', loadChildren: () => import('./pages/inactive-post/inactive-post.module').then(m => m.InactivePostModule) },
  { path: 'users/editUser/:id', loadChildren: () => import('./pages/users/edit-user/edit-user.module').then(m => m.EditUserModule) },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
