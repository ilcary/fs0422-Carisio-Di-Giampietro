import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ListComponent } from './list.component';
import { CardComponent } from './card.component';
import { MaiuscoloPipe } from '../pipes/maiuscolo.pipe';



@NgModule({
  declarations: [
    ListComponent,
    CardComponent,
    MaiuscoloPipe
  ],
  imports: [
    CommonModule
  ],
  exports: [
    ListComponent,
    CardComponent,
    CommonModule,
    MaiuscoloPipe
  ]
})
export class SharedModule { }
