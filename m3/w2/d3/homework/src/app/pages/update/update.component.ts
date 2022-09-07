import { Component, OnInit } from '@angular/core';
import { Post } from 'src/app/post';
import { PostsServiceService } from 'src/app/service/posts-service.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-update',
  templateUrl: './update.component.html',
  styleUrls: ['./update.component.scss']
})
export class UpdateComponent implements OnInit {

  constructor(private postService: PostsServiceService,private route:ActivatedRoute) { }

  post!: Post;

  ngOnInit(): void {
    let userId = this.route.snapshot.params['id']
    this.post = this.postService.getUserById(userId)
  }

  save(){
    this.postService.addNewPost(this.post)
    }

}
