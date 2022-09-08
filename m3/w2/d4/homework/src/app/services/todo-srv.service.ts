import { Injectable } from '@angular/core';
import { Todo } from '../class/todo';

@Injectable({
  providedIn: 'root'
})
export class TodoSrvService {

  constructor() { }


  allTodos:Todo[] = []

  lastId:number = 0;

  getAllTodos():Todo[] {
    return this.allTodos
  }

  getTodoById(id:number):Todo|null {
    let foundTodo = this.allTodos.find((Todo:Todo) => Todo.id === id);
    return foundTodo ||null
  }

  addTodo(todo:Todo):void {
    todo = Object.assign({}, todo);
    this.lastId++
    todo.id = this.lastId
    this.allTodos.push(todo);
  }

  deleteTodo(id: number):void{
    this.allTodos = this.allTodos.filter((u:Todo)=> u.id !== id)
  }

  editTodo(todo:Todo):void{
    let index = this.allTodos.findIndex(todo => todo.id == todo.id)
    this.allTodos.splice(index,1)
  }
}


