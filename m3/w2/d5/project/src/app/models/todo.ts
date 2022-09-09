import { Fortodo } from "../fortodo";

export class Todo implements Fortodo{
  id: number|undefined;
  title: string;
  content: string;
  completed: boolean;

  constructor( title: string,content:string){
    this.title = title;
    this.content = content;
    this.completed = false;
  }
}
