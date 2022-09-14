import { Component, Input, OnInit } from '@angular/core';
import { Post } from '../models/post';

@Component({
  selector: 'app-post-card',
  template: `
    <div
      [ngClass]="{
        'bg-warning': post.type == 'news',
        'bg-info': post.type == 'education',
        'bg-dark': post.type == 'politic',
        'text-white': post.type == 'politic'
      }"
      class="card mb-4"
    >
      <h5 class="card-header"><span appHighlight >Post</span></h5>
      <div class="card-body">
        <h5 class="card-title">{{ post.title | maiuscolo }}</h5>
        <p class="card-text">
          {{ post.body }}
        </p>
        <ng-content></ng-content>
        
      </div>
    </div>
  `,
  styles: [],
})
export class PostCardComponent implements OnInit {
  @Input() post!: Post;
  @Input() bgColor!: string;

  constructor() {}

  ngOnInit(): void {}
}
