import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './pages/home/home.component';
import { EditComponent } from './pages/posts/edit/edit.component';
import { ListComponent } from './pages/posts/list/list.component';
import { NewComponent } from './pages/posts/new/new.component';
import { PostsComponent } from './pages/posts/posts.component';
import { ProvaComponent } from './prova/prova.component';

const routes: Routes = [
  {
    path:'',
    component:HomeComponent,
    pathMatch:'full'//serve ad evitare confusione con altre rotte che riportano ''
  },
  {
    path:'posts',
    component:PostsComponent,
    children: [
      {
        path:'',
        component:ListComponent
      },
      {
        path:'new',
        component:NewComponent
      },
      {
        path:'edit/:id',
        component:EditComponent
      }
    ]
  },
  {
    path:'prova',
    component:ProvaComponent,
  },
  {
    path:'prova/:id/:nome',
    component:ProvaComponent,
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
