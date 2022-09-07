import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { UtentiListComponent } from './utenti/utenti-list/utenti-list.component';
import { UtentiNewComponent } from './utenti/utenti-new/utenti-new.component';
import { UtentiEditComponent } from './utenti/utenti-edit/utenti-edit.component';
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    UtentiListComponent,
    UtentiNewComponent,
    UtentiEditComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
