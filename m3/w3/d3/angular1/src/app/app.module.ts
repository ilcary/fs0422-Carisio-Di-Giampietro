import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PizzeComponent } from './pizze/pizze/pizze.component';
import { PizzeListComponent } from './pizze/pizze-list/pizze-list.component';
import { PizzeDetailComponent } from './pizze/pizze-detail/pizze-detail.component';
import { HomeComponent } from './home/home.component';
import { SharedModule } from './shared/shared.module';
import { BrowserModule } from '@angular/platform-browser';

@NgModule({
  declarations: [
    AppComponent,
    PizzeComponent,
    PizzeListComponent,
    PizzeDetailComponent,
    HomeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    SharedModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
