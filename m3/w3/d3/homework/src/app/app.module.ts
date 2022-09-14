import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { Route, RouterModule } from '@angular/router';

import { AppComponent } from './app.component';
import { NavbarComponent } from './navbar.component';
import { HomePage } from './pages/home.page';
import { ActivePostsPage } from './pages/active-posts.page';
import { InactivePostsPage } from './pages/inactive-posts.page';
import { PostCardComponent } from './components/post-card.component';
import { MaiuscoloPipe } from './pipes/maiuscolo.pipe';
import { HighlightDirective } from './directives/highlight.directive';
import { PostDetailsPage } from './pages/post-details.page';
import { UsersPage } from './pages/users/users.page';
import { UsersDetailsPage } from './pages/users/users-details.page';
import { UsersRoutingModule } from './pages/users/users-routing.module';
import { CardComponent } from './shared/card.component';
import { SharedModule } from './shared/shared.module';
import { AuthGuard } from './auth.guard';

const routes:Route[] = [
  {
    path:"",
    component:HomePage
  },
  {
    path:"active-posts",
    component:ActivePostsPage
  },
  {
    path:"inactive-posts",
    component:InactivePostsPage,
    canActivate: [AuthGuard]
  },
  {
    path:"active-posts/:id",
    component:PostDetailsPage
  },
  {
    path:"inactive-posts/:id",
    component:PostDetailsPage
  },
  {
    path:"users",
    loadChildren: () => import("./pages/users/users.module").then((m) => m.UsersModule)
  },
  {
    path:"**",
    redirectTo:""
  }
]

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    HomePage,
    ActivePostsPage,
    InactivePostsPage,
    PostCardComponent,
    HighlightDirective,
    PostDetailsPage
    
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(routes),
    UsersRoutingModule,
    SharedModule
  ],
  providers: [],
  bootstrap: [AppComponent],
  exports: [RouterModule]
})
export class AppModule { }
