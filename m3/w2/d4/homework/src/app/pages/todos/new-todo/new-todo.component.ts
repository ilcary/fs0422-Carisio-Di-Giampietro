import { Component, OnInit } from '@angular/core';
import { Todo } from 'src/app/class/todo';
import { User } from 'src/app/class/user';
import { TodoSrvService } from 'src/app/services/todo-srv.service';
import { UserSrvService } from 'src/app/services/user-srv.service';

@Component({
  selector: 'app-new-todo',
  templateUrl: './new-todo.component.html',
  styleUrls: ['./new-todo.component.css']
})
export class NewTodoComponent implements OnInit {

  constructor(private todoSrv : TodoSrvService , private userSrv: UserSrvService) { }

  newTodo:Todo= new Todo('','','')
  allUsers:User[] = this.userSrv.getAllUsers();

  ngOnInit(): void {
  }

  save(): void {
    this.todoSrv.addTodo(this.newTodo);
  }

}
