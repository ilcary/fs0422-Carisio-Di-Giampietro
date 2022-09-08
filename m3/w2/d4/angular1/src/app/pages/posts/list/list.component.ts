import { Component, OnInit } from '@angular/core';
import { Post } from 'src/app/Models/post';
import { PostService } from 'src/app/post.service';

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.scss']
})
export class ListComponent implements OnInit {
  allPosts:Post[] = []

  constructor(private postSvc:PostService) { }

  ngOnInit(): void {
    this.allPosts = this.postSvc.getAllPosts()
  }

  deletePost(post: Post){
    if(post.id){
      this.postSvc.deletePost(post.id)
      this.allPosts = this.postSvc.getAllPosts()
    }
  }
}
