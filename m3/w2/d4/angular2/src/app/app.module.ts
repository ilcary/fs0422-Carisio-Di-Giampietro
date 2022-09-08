import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { ColoraDirective } from './colora.directive';
import { CutPipe } from './cut.pipe';

@NgModule({
  declarations: [
    AppComponent,
    ColoraDirective,
    CutPipe
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
