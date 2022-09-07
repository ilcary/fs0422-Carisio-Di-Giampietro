export class Post {
  id:number | undefined;
  userId:number | string;
  body!:string;
  title!:string;
  active!:boolean;
  type:string

  constructor(body:string, title:string,userId:number | string, type:string) {
    this.body = body;
    this.title = title;
    this.active = true;
    this.userId = userId;
    this.type = type;
  }
}
