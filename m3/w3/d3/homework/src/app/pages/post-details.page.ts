import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Subscription } from 'rxjs';
import { Post } from '../models/post';
import { PostsService } from '../posts.service';

@Component({
  template: `
    <div class="container ">
      <ng-container *ngIf="post; else elseTemplate">
        <h1 class="text-center mt-4 mb-3">
          {{ post.title }}
        </h1>
        <p>{{post.body}}</p>
        <p>Categoria: {{post.type}}</p>
        <p>Autore: {{post.author}}</p>
      </ng-container>
    </div>
    <ng-template #elseTemplate>
      <h1 class="text-center mt-5">post non trovato</h1>
    </ng-template>
  `,
  styles: [],
})
export class PostDetailsPage implements OnInit {
  sub!: Subscription;
  post: Post | undefined;
  constructor(private router: ActivatedRoute, private postsSrv: PostsService) {}

  ngOnInit(): void {
    this.sub = this.router.params.subscribe((params) => {
      const id = +params['id'];
      console.log(id);
      this.post = this.postsSrv.getPost(id);
    });
  }

  ngOnDestroy(): void {
    //Called once, before the instance is destroyed.
    //Add 'implements OnDestroy' to the class.
    this.sub.unsubscribe();
  }
}
