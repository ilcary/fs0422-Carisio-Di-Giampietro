import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { faPenToSquare } from '@fortawesome/free-solid-svg-icons';
import { faTrash } from '@fortawesome/free-solid-svg-icons';
import { Todo } from 'src/app/models/todo';
import { SvrTodoService } from 'src/app/services/svr-todo.service';

@Component({
  selector: 'app-todo-list',
  templateUrl: './todo-list.component.html',
  styleUrls: ['./todo-list.component.scss']
})
export class TodoListComponent implements OnInit {

  faPenToSquare = faPenToSquare
  faTrash = faTrash

  allTodos:Todo[] = []

  constructor(private todoSrv : SvrTodoService,private router: Router) {
    router.events.subscribe((val) => {
      this.ngOnInit()
  })
   }

  ngOnInit(): void {
    this.todoSrv.getAllTodos().then(result => this.allTodos = result)
  }



  doneIt(todo: Todo): void {
    todo.completed = !todo.completed;
    this.todoSrv.editTodo(todo,todo.id)
    console.log('aggiornato');

  }

  deleteTodoo(todo: Todo): void {
    if(todo.id)
    this.todoSrv.deleteTodo(todo.id)
    this.ngOnInit()
  }


}
