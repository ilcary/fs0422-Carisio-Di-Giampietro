import { Component, OnInit } from '@angular/core';
import { Post } from '../models/post';
import { PostsService } from '../posts.service';

@Component({
  template: `
    <app-list>
    <app-card *ngFor="let post of posts" [post]="post"></app-card>
    </app-list>
  `,
  styles: [],
})
export class ActivePostsPage implements OnInit {
  posts!: Post[];
  constructor(private postsSrv:PostsService) {}

  async ngOnInit() {
    const posts = await this.postsSrv.getPosts()
    this.posts = posts;
    console.log(this.posts);
  }

  onInactivePost(id:number,i:number){
    this.postsSrv.updatePost({active:false},id)
    this.posts.splice(i,1)
  }
}
