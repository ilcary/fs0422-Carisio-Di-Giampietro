import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsComponent } from './forms/forms.component';
import { NgSubmitComponent } from './ng-submit/ng-submit.component';
import { NgmodelgroupComponent } from './ngmodelgroup/ngmodelgroup.component';

@NgModule({
  declarations: [
    AppComponent,
    FormsComponent,
    NgSubmitComponent,
    NgmodelgroupComponent
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
