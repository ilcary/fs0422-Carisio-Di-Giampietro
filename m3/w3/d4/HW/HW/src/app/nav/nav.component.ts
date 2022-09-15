import { Component, OnInit } from '@angular/core';
import { AuthService, ILogin } from '../auth/auth.service';

@Component({
  selector: 'app-nav',
  templateUrl: './nav.component.html',
  styleUrls: ['./nav.component.scss']
})
export class NavComponent implements OnInit {


  constructor(private auth: AuthService) { }

  // name:string | null = this.auth.getLoggedUser().name

  user!:{email:string, name:string}

  ngOnInit(): void {
  }

  ngDoCheck(): void {
    if(this.checkLog()){
      this.user = this.getLoggedUser()
    }
  }

  checkLog():boolean{
    return this.auth.isUserLogged()
  }

  logOut(){
    this.auth.logOut();
  }

  getLoggedUser():ILogin{
   return this.auth.getLoggedUser();
  }


}
