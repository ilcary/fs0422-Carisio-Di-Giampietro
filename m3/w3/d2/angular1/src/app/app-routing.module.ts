import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { FormsComponent } from './forms/forms.component';
import { NgSubmitComponent } from './ng-submit/ng-submit.component';
import { NgmodelgroupComponent } from './ngmodelgroup/ngmodelgroup.component';

const routes: Routes = [
  {
    path: '',
    component: FormsComponent
  },
  {
    path: 'ngsubmit',
    component: NgSubmitComponent
  },
  {
    path: 'ngmodelgroup',
    component: NgmodelgroupComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
