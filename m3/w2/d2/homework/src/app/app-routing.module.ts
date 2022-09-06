import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './pages/home/home.component';
import { PostInattiviComponent } from './pages/post-inattivi/post-inattivi.component';

const routes: Routes = [
  {
    path:'',
    component: HomeComponent
  },
  {
    path:'post-inattivi',
    component: PostInattiviComponent
  }
]

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {

}
