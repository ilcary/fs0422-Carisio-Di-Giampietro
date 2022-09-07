import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { UtentiEditComponent } from './utenti/utenti-edit/utenti-edit.component';
import { UtentiListComponent } from './utenti/utenti-list/utenti-list.component';
import { UtentiNewComponent } from './utenti/utenti-new/utenti-new.component';

const routes: Routes = [
  {
    path:'',
    component:UtentiListComponent
  },
  {
    path:'create',
    component:UtentiNewComponent
  },
  {
    path:'edit/:id',
    component:UtentiEditComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
