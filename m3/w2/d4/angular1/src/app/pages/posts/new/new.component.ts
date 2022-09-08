import { Component, OnInit } from '@angular/core';
import { Post } from 'src/app/Models/post';
import { PostService } from 'src/app/post.service';

@Component({
  selector: 'app-new',
  templateUrl: './new.component.html',
  styleUrls: ['./new.component.scss']
})
export class NewComponent implements OnInit {

  newPost:Post = new Post('','');

  constructor(private postSvc:PostService) { }

  ngOnInit(): void {
  }

  save(){
    this.postSvc.addPost(this.newPost)
  }

}
