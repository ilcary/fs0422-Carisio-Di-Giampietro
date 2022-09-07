import { Component } from '@angular/core';
import {User} from './user'

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  allUsers: User[] = [];

  addUser(event:User) {
   let userCopy = Object.assign({}, event)
    this.allUsers.push(userCopy)
  }

}
