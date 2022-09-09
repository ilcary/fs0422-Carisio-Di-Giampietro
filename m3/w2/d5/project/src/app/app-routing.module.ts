import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EdittodoComponent } from './pages/home/edittodo/edittodo.component';
import { HomeComponent } from './pages/home/home.component';
import { NewtodoComponent } from './pages/home/newtodo/newtodo.component';

const routes: Routes = [
  {
    path: '',
    component: HomeComponent,
    children: [
      {
        path:'newtodo',
        component: NewtodoComponent
    },
    {
      path:'edittodo/:id',
      component: EdittodoComponent
    }
  ]
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
