import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './main/header/header.component';
import { FooterComponent } from './main/footer/footer.component';
import { HomeComponent } from './pages/home/home.component';
import { ChiSiamoComponent } from './pages/chi-siamo/chi-siamo.component';
import { ContattiComponent } from './pages/contatti/contatti.component';
import { UtentiComponent } from './pages/utenti/utenti.component';
import { UtentiDettaglioComponent } from './pages/utenti-dettaglio/utenti-dettaglio.component';
import { UtentiCardComponent } from './pages/utenti-card/utenti-card.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    HomeComponent,
    ChiSiamoComponent,
    ContattiComponent,
    UtentiComponent,
    UtentiDettaglioComponent,
    UtentiCardComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
