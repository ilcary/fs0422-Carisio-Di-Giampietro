import { Component, OnInit } from '@angular/core';
import { Todo } from 'src/app/class/todo';
import { TodoSrvService } from 'src/app/services/todo-srv.service';

@Component({
  selector: 'app-todos',
  templateUrl: './todos.component.html',
  styleUrls: ['./todos.component.css']
})
export class TodosComponent implements OnInit {

  constructor(private todoSrv : TodoSrvService) { }

  allTodos:Todo[] = this.todoSrv.getAllTodos();

  ngOnInit(): void {
  }

  deleteUser(todo: Todo): void {
    if(todo.id){
      this.todoSrv.deleteTodo(todo.id);
      this.allTodos = this.todoSrv.getAllTodos()
    }
  }

}
