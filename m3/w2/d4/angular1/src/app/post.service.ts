import { Injectable } from '@angular/core';
import { Post } from './Models/post';

@Injectable({
  providedIn: 'root'
})
export class PostService {

  constructor() { }

  allPosts:Post[] = [];

  lastId:number = 0;

  getAllPosts(){
    return this.allPosts
  }
  getPostById(id:number):Post|null{
    console.log(this.allPosts)
    let foundPost = this.allPosts.find((post:Post) => post.id == id)
    console.log(foundPost)
    return foundPost || null;
  }

  addPost(post:Post):void{
    post = Object.assign({}, post)//{...post}

    //siccome non abbiamo un back end che definisce gli id
    this.lastId++;
    post.id = this.lastId

    this.allPosts.push(post);
  }

  deletePost(id:number):void{
    this.allPosts = this.allPosts.filter((p:Post) => p.id != id)
  }

  editPost(post:Post):void{
    let index = this.allPosts.findIndex((p:Post) => p.id == post.id)
    this.allPosts.splice(index, 1, post)
  }


}
