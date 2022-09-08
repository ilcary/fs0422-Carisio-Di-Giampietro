import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './pages/home/home.component';
import { NewTodoComponent } from './pages/todos/new-todo/new-todo.component';
import { SpecificTodoComponent } from './pages/todos/specific-todo/specific-todo.component';
import { TodosComponent } from './pages/todos/todos.component';
import { EdituserComponent } from './pages/users/edituser/edituser.component';
import { NewuserComponent } from './pages/users/newuser/newuser.component';
import { UsersComponent } from './pages/users/users.component';

const routes: Routes = [
  {
    path:'',
    component: HomeComponent
  },
  {
    path: 'todos',
    component: TodosComponent,
    children: [
      {
        path: 'newtodo',
        component: NewTodoComponent
      },
      {
        path:'edittodo/:id',
        component: EdituserComponent
      },
      {
        path:'moretodo/:id',
        component: SpecificTodoComponent
      }
    ]
  },
  {
    path: 'users',
    component: UsersComponent,
    children: [
      {
        path: 'newuser',
        component: NewuserComponent
      },
      {
        path:'edituser/:id',
        component: EdituserComponent
      }
    ]
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
