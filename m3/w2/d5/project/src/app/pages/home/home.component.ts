import { Component, OnInit } from '@angular/core';
import { Todo } from 'src/app/models/todo';
import { SvrTodoService } from 'src/app/services/svr-todo.service';
import { faPenToSquare } from '@fortawesome/free-solid-svg-icons';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit {

  faPenToSquare = faPenToSquare

  allTodos:Todo[] = []

  constructor(private todoSrv : SvrTodoService) { }

  ngOnInit(): void {
    this.todoSrv.getAllTodos().then(result => this.allTodos = result)
  }



  doneIt(todo: Todo): void {
    todo.completed = !todo.completed;
    this.todoSrv.editTodo(todo,todo.id)
    console.log('aggiornato');

  }


}
