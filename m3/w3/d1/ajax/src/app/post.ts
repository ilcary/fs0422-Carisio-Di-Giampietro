export class Post {

  id: number | undefined;
  title: string;
  content: string;
  data:Date;
  constructor(title: string, content: string, data: Date = new Date()) {
    this.title = title;
    this.content = content;
    this.data = data;
  }

}
