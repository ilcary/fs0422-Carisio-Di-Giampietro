import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './pages/home/home.component';
import { TodosComponent } from './pages/todos/todos.component';
import { UsersComponent } from './pages/users/users.component';
import { HeaderComponent } from './main/header/header.component';
import { FormsModule } from '@angular/forms';
import { NewuserComponent } from './pages/users/newuser/newuser.component';
import { EdituserComponent } from './pages/users/edituser/edituser.component';
import { EditTodoComponent } from './pages/todos/edit-todo/edit-todo.component';
import { NewTodoComponent } from './pages/todos/new-todo/new-todo.component';
import { SpecificTodoComponent } from './pages/todos/specific-todo/specific-todo.component';
import { UpperTitlePipe } from './upper-title.pipe';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    TodosComponent,
    UsersComponent,
    HeaderComponent,
    NewuserComponent,
    EdituserComponent,
    EditTodoComponent,
    NewTodoComponent,
    SpecificTodoComponent,
    UpperTitlePipe,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
