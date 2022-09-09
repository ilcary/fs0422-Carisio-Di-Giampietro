import { Component, OnInit } from '@angular/core';
import { Todo } from 'src/app/models/todo';
import { SvrTodoService } from 'src/app/services/svr-todo.service';

@Component({
  selector: 'app-newtodo',
  templateUrl: './newtodo.component.html',
  styleUrls: ['./newtodo.component.scss']
})
export class NewtodoComponent implements OnInit {

  constructor(private todoSrv : SvrTodoService) { }

  newTodo:Todo= new Todo('','');

  ngOnInit(): void {
  }

  allTodos!:Todo[];

  getTodos(): void {this.todoSrv.getAllTodos().then(result => this.allTodos = result)}

  save(): void {
    this.todoSrv.addTodo(this.newTodo)
  }

}
