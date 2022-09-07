import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { TableComponent } from './table/table.component';
import { FormComponent } from './form/form.component';
import { ProvaDestroyComponent } from './prova-destroy/prova-destroy.component';
import { AccordionBodyComponent } from './accordion-body/accordion-body.component';
import { AccordionSectionComponent } from './accordion-section/accordion-section.component';

@NgModule({
  declarations: [
    AppComponent,
    TableComponent,
    FormComponent,
    ProvaDestroyComponent,
    AccordionBodyComponent,
    AccordionSectionComponent
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
