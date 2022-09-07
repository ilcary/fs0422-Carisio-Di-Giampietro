import { Component, OnInit } from '@angular/core';
import { Post } from 'src/app/post';
import { PostsServiceService } from 'src/app/service/posts-service.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit {

  constructor(private postService: PostsServiceService) { }

  allPosts: Post[]=  this.postService.getAllActivePost();

  ngOnInit(): void {
    this.postService.getPosts()
    console.log(this.allPosts);

  }

  updatePost(id:string| number| undefined){

  }


  disable(id: undefined| number){
    this.postService.disablePost(id)
  }

}
