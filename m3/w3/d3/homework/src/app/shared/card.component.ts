import { Component, Input, OnInit } from '@angular/core';
import { Post } from '../models/post';
import { MaiuscoloPipe } from "../pipes/maiuscolo.pipe"

@Component({
  selector: 'app-card',
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
    
    
  </div>
</div>
  `,
  styles: [
  ]
})
export class CardComponent implements OnInit {
  @Input() post!: Post;

  constructor() { }

  ngOnInit(): void {
  }

}
