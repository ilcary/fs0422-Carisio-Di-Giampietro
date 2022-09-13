import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './pages/home/home.component';
import { NewHeroComponent } from './pages/new-hero/new-hero.component';
import { HeaderComponent } from './main/header/header.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { NewHeroReactiveComponent } from './pages/new-hero-reactive/new-hero-reactive.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    NewHeroComponent,
    HeaderComponent,
    NewHeroReactiveComponent

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
