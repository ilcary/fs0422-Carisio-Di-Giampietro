import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Todo } from 'src/app/models/todo';
import { SvrTodoService } from 'src/app/services/svr-todo.service';

@Component({
  selector: 'app-edittodo',
  templateUrl: './edittodo.component.html',
  styleUrls: ['./edittodo.component.scss']
})
export class EdittodoComponent implements OnInit {

  constructor(private todoSrv : SvrTodoService, private route : ActivatedRoute, private router : Router) { }

  currentTodo!:Todo;
  todoId!:number
  allTodos:Todo[] = []

  ngOnInit(): void {
    this.todoId = Number(this.route.snapshot.paramMap.get('id'))
    this.todoSrv.getAllTodos().then(result => {
      let itemtodo = result.find((todo:Todo) => todo.id === this.todoId);
      if(itemtodo)
      this.currentTodo =itemtodo
    })
  }


save(todo: Todo): void {
  this.todoSrv.editTodo(todo,todo.id)
  console.log('aggiornato');
}
}
