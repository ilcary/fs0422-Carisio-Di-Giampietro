import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ChiSiamoComponent } from './pages/chi-siamo/chi-siamo.component';
import { ContattiComponent } from './pages/contatti/contatti.component';
import { HomeComponent } from './pages/home/home.component';
import { UtentiDettaglioComponent } from './pages/utenti-dettaglio/utenti-dettaglio.component';
import { UtentiComponent } from './pages/utenti/utenti.component';

const routes: Routes = [
  {
    path:'',
    component: HomeComponent
  },
  {
    path:'chi-siamo',
    component: ChiSiamoComponent
  },
  {
    path:'contatti',
    component: ContattiComponent
  },
  {
    path:'utenti',
    component: UtentiComponent,
    children: [{
      path:':id',
      component: UtentiDettaglioComponent
    }]
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
