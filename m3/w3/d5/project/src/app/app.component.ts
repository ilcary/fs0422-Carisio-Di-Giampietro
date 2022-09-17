import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthService } from './services/auth.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss'],
})
export class AppComponent implements OnInit {
  logged!: boolean;
  loggedUserName!: string;

  constructor(private auth: AuthService,private router: Router) {}

  ngOnInit(): void {
    this.router.events.subscribe(() => this.checkForNavName())

  }

  checkForNavName():void{
    this.logged = this.auth.isUserLogged();
    console.log(this.logged);
    console.log(this.auth.getLoggedUser());
    if (this.logged){
      this.loggedUserName = this.auth.getLoggedUser()?.name
    }

  }

  logOut() {
    this.auth.logOut();
    this.checkForNavName()
  }

  isCollapsed = false;
}
