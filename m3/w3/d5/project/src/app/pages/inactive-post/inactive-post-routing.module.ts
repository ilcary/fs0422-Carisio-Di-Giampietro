import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { InactivePostComponent } from './inactive-post.component';

const routes: Routes = [{ path: '', component: InactivePostComponent }];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class InactivePostRoutingModule { }
