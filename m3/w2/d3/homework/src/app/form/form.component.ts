import { Component, OnInit } from '@angular/core';
import { Post } from '../post';
import { PostsServiceService } from '../service/posts-service.service';

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
  styleUrls: ['./form.component.scss']
})
export class FormComponent implements OnInit {

  constructor(private postService: PostsServiceService) { }

  newPost:Post = new Post('','','','')

  ngOnInit(): void {
  }

  save(){
    this.postService.addNewPost(this.newPost)
  }

}
