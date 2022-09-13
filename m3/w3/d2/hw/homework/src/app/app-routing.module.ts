import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './pages/home/home.component';
import { NewHeroReactiveComponent } from './pages/new-hero-reactive/new-hero-reactive.component';
import { NewHeroComponent } from './pages/new-hero/new-hero.component';

const routes: Routes = [
  {
    path:'',
    component: HomeComponent
  },
  {
    path:'newhero',
    component: NewHeroComponent
  },
  {
    path:'newheroreactive',
    component: NewHeroReactiveComponent
  }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
