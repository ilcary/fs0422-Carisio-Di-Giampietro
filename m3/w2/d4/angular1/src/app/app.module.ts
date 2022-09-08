import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './pages/home/home.component';
import { PostsComponent } from './pages/posts/posts.component';
import { NewComponent } from './pages/posts/new/new.component';
import { EditComponent } from './pages/posts/edit/edit.component';
import { ListComponent } from './pages/posts/list/list.component';
import { HeaderComponent } from './sections/header/header.component';
import { FormsModule } from '@angular/forms';
import { ProvaComponent } from './prova/prova.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    PostsComponent,
    NewComponent,
    EditComponent,
    ListComponent,
    HeaderComponent,
    ProvaComponent
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
