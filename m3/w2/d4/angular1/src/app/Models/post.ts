export class Post {
  id: number | undefined;
  title: string;
  content: string;
  slug: string;
  date: Date;
  constructor( title: string, content: string, id?: number){
    this.title = title;
    this.content = content;
    this.slug = '';
    this.date = new Date();
    this.id = id;
  }
}
