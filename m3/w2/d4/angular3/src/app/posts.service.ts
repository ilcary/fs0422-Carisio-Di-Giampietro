import { Injectable } from '@angular/core';
import { Post } from './post';

@Injectable({
  providedIn: 'root'
})
export class PostsService {

  constructor() { }

  postUrl:string = 'http://localhost:3000/posts'

  postArray:Post[] = []

  getAllPosts():Promise<Post[]>{
     return new Promise<Post[]>((resolve, reject) => {
        setTimeout(() =>{
          let call = fetch(this.postUrl).then(res => res.json())
          resolve(call)
        },2000)
    })

  }

  //addPost(post).then()



}
