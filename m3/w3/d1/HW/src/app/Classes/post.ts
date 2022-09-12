export class Post {
  id:number | undefined;
  albumId:number;
  title:string;
  url:string;
  thumbnailUrl:string;
  like:boolean;

  constructor(albumId:number, title:string, url:string, thumbnailUrl:string){
    this.albumId = albumId;
    this.title = title;
    this.url = url;
    this.thumbnailUrl = thumbnailUrl;
    this.like = false;
  }
}
