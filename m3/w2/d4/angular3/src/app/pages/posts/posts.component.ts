import { Component, OnInit } from '@angular/core';
import { Post } from 'src/app/post';
import { PostsService } from 'src/app/posts.service';

@Component({
  selector: 'app-posts',
  templateUrl: './posts.component.html',
  styleUrls: ['./posts.component.scss']
})
export class PostsComponent implements OnInit {

  posts: Post[] = [];

  constructor(private postSvc:PostsService) { }

  ngOnInit(): void {
    this.postSvc.getAllPosts()
    .then(res => {
      this.posts = res
    })
  }

}
