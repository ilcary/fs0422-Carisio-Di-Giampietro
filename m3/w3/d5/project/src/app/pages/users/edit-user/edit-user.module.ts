import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { EditUserRoutingModule } from './edit-user-routing.module';
import { EditUserComponent } from './edit-user.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { NzFormModule } from 'ng-zorro-antd/form';
import { NzInputModule } from 'ng-zorro-antd/input';
import { NzSkeletonModule } from 'ng-zorro-antd/skeleton';


@NgModule({
  declarations: [
    EditUserComponent
  ],
  imports: [
    CommonModule,
    EditUserRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    NzFormModule,
    NzInputModule,
    NzSkeletonModule
  ]
})
export class EditUserModule { }
