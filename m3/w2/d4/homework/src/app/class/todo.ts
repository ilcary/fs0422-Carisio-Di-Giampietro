export class Todo {
  id: number | undefined;
  user: string;
  title: string;
  content: string;
  constructor(user: string, title: string, content: string, id?: number){
    this.user = user;
    this.title = title;
    this.content = content;
    this.id = id;
  }
}
