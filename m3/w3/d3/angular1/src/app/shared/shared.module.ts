import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ItemComponent } from './item/item.component';
import { ListComponent } from './list/list.component';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';



@NgModule({
  declarations: [
    ItemComponent,
    ListComponent
  ],
  imports: [
    CommonModule,
    FormsModule
  ],
  exports: [
    ItemComponent,
    ListComponent,
    CommonModule,
    FormsModule
  ]
})
export class SharedModule { }
