import { Injectable } from '@angular/core';
import { Todo } from '../models/todo';

@Injectable({
  providedIn: 'root',
})
export class SvrTodoService {
  constructor() {}

  todo_API: string = 'http://localhost:3000/todo';

  /*   allTodos: Todo[] = []; */

  getAllTodos(): Promise<Todo[]> {
    return new Promise<Todo[]>((resolve, reject) => {
      setTimeout(() => {
        let call = fetch(this.todo_API).then((res) => res.json());
        resolve(call);
      }, 2000);
    });
  }

/*   getTodoById(id:number| undefined):Promise<Todo> {
    return new Promise((resolve, reject) => {
      setTimeout(() =>{
        resolve(fetch(this.todo_API+'/'+id).then((res) => res.json()))
      },2000)
    })
  } */

  addTodo(todo:Todo):Promise<Todo> {
    return new Promise((resolve, reject) => {
      setTimeout(() =>{
        let todoCopy = Object.assign({}, todo);

        let option = {
          method: 'POST',
          body: JSON.stringify(todoCopy),
          headers: {
            'content-type': 'application/json',
          },
        };
        resolve(fetch(this.todo_API, option).then((res) => res.json()))
      },2000)
    })
  }

  deleteTodo(id: number): void {
    let options = {
      method: 'DELETE',
      headers: {
        'content-type': 'application/json',
      },
    };

    fetch(this.todo_API + '/' + id, options).then((res) => res.json());
  }

  editTodo(todo:Todo, id:number| undefined):Promise<Todo>{
    return new Promise((resolve, reject) => {
      setTimeout(() =>{
        let option = {
          method: 'PATCH',
          body: JSON.stringify(todo),
          headers: {
            'content-type': 'application/json',
          },
        };

        resolve(fetch(this.todo_API+'/'+id, option).then((res) => res.json()))
      },2000)
    })
  }
}
