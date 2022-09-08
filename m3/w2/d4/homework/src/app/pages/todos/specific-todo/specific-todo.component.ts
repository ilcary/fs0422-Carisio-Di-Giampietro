import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Todo } from 'src/app/class/todo';
import { TodoSrvService } from 'src/app/services/todo-srv.service';

@Component({
  selector: 'app-specific-todo',
  templateUrl: './specific-todo.component.html',
  styleUrls: ['./specific-todo.component.css'],
})
export class SpecificTodoComponent implements OnInit {
  constructor(
    private todoSrv: TodoSrvService,
    private activeRoute: ActivatedRoute, //contiene nle info sulla rotta appena caricata
    private router: Router //permette di forzare la navigazione
  ) {}

  currenttodo!: Todo

  ngOnInit(): void {
    let todoId:number = Number(this.activeRoute.snapshot.paramMap.get('id'))
    let todo:Todo|null = this.todoSrv.getTodoById(todoId)
    if(todo){
      this.currenttodo = todo
    }else{
      this.router.navigate(['/todos'])
    }
  }

  save():void{
    this.todoSrv.editTodo(this.currenttodo)
  }

}
