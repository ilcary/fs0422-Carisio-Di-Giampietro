import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { PostsRoutingModule } from './posts-routing.module';
import { PostsComponent } from './posts.component';
import { NzCardModule } from 'ng-zorro-antd/card';
import { IconsProviderModule } from 'src/app/icons-provider.module';


@NgModule({
  declarations: [
    PostsComponent
  ],
  imports: [
    CommonModule,
    PostsRoutingModule,
    NzCardModule,
    IconsProviderModule
  ]
})
export class PostsModule { }
