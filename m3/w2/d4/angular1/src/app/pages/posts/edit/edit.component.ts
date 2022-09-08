import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Post } from 'src/app/Models/post';
import { PostService } from 'src/app/post.service';

@Component({
  selector: 'app-edit',
  templateUrl: './edit.component.html',
  styleUrls: ['./edit.component.scss']
})
export class EditComponent implements OnInit {

  currentPost!:Post;

  constructor(
    private postSvc:PostService,
    private activeRoute:ActivatedRoute,//contiene nle info sulla rotta appena caricata
    private router:Router//permette di forzare la navigazione
    ) { }

  ngOnInit(): void {
    let postId:number = Number(this.activeRoute.snapshot.paramMap.get('id'))
    let post:Post|null = this.postSvc.getPostById(postId)
    if(post){
      this.currentPost = post
    }else{
      this.router.navigate(['/posts'])
    }
  }

  save(){
    this.postSvc.editPost(this.currentPost)
  }

}
