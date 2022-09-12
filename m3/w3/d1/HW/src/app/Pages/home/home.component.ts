import { Component, OnInit } from '@angular/core';
import { Post } from 'src/app/Classes/post';
import { PostService } from 'src/app/Services/post.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit {

  constructor(private postSvc: PostService) { }

  posts:Post[] = [];
  likesNum:number = 0;

  ngOnInit(): void {
    this.postSvc.getAllPosts().subscribe(
      {
        next: res => {
          this.posts = res;
          this.likesNum = this.posts.filter(p => p.like == true).length;
        },
        error: error => console.log(error)
      }
    )
  }

  deletePost(post: Post): void {
    this.postSvc.deletePost(post).subscribe(res => {
      let index:number = this.posts.findIndex(p => p.id === post.id)
      this.posts.splice(index, 1);
    })
  }

  like(post:Post):void{
    post.like = !post.like;
    this.postSvc.editPost(post).subscribe(res => {
      let index:number = this.posts.findIndex(p => p.id === post.id)
      this.posts.splice(index, 1, post);
      this.likesNum = this.posts.filter(p => p.like == true).length;
    })
  }

}
