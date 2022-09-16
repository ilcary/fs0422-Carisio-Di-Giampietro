import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { InactivePostRoutingModule } from './inactive-post-routing.module';
import { InactivePostComponent } from './inactive-post.component';


@NgModule({
  declarations: [
    InactivePostComponent
  ],
  imports: [
    CommonModule,
    InactivePostRoutingModule
  ]
})
export class InactivePostModule { }
