import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { NzTableModule } from 'ng-zorro-antd/table';
import { UsersRoutingModule } from './users-routing.module';
import { UsersComponent } from './users.component';
import { IconsProviderModule } from 'src/app/icons-provider.module';
import { FormsModule } from '@angular/forms';
import { NzDividerModule } from 'ng-zorro-antd/divider';


@NgModule({
  declarations: [
    UsersComponent
  ],
  imports: [
    CommonModule,
    UsersRoutingModule,
    NzTableModule,
    IconsProviderModule,
    FormsModule,
    NzDividerModule
  ]
})
export class UsersModule { }
