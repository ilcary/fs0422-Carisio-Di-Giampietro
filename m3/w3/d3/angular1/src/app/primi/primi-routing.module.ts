import { RouterModule, Routes } from '@angular/router';
import { NgModule } from '@angular/core';
import { PrimiComponent } from './primi/primi.component';
import { PrimiListComponent } from './primi-list/primi-list.component';
import { PrimiDetailComponent } from './primi-detail/primi-detail.component';

const routes:Routes = [
  {
    path: '',// primi
    component: PrimiComponent,
    children: [
      {
        path:'',// primi
        component: PrimiListComponent
      }
    ]
  },
  {
    path: 'detail/:id', // primi/detail/5
    component: PrimiDetailComponent
  }
]

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class PrimiRoutingModule { }
