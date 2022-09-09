import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Todo } from 'src/app/models/todo';
import { SvrTodoService } from 'src/app/services/svr-todo.service';

@Component({
  selector: 'app-edittodo',
  templateUrl: './edittodo.component.html',
  styleUrls: ['./edittodo.component.scss'],
})
export class EdittodoComponent implements OnInit {
  constructor(
    private todoSrv: SvrTodoService,
    private route: ActivatedRoute,
    private router: Router
  ) {}

  currentTodo: Todo = new Todo('', '');
  todoId!: number;
  done:boolean = false;

  ngOnInit(): void {
    console.log(this.done);
    this.route.params.subscribe((params: any) => {
      console.log(params);
      this.todoId = params.id;
      this.todoSrv.getTodoById(this.todoId).then((result) => {
        console.log(result);
        this.currentTodo = result;
        this.done = true
        console.log(this.done);

      });
    });
  }

  save(todo: Todo): void {
    this.todoSrv.editTodo(todo, todo.id);
    console.log('aggiornato');
    this.router.navigate(['/'])
  }
}
