import { Component, ElementRef, OnInit, ViewChild } from '@angular/core';
import { User } from './Models/user';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {

  log(): void {
    console.log(this.pippo)
    this.pippo.nativeElement.style.color = 'red'
  }

  @ViewChild('pippo') pippo!:ElementRef;

  allUsers: User[] = []

  visible:boolean = true
  visibleCss:boolean = true


  addUser(event:User){
    let userCopy = Object.assign({}, event)
    this.allUsers.push(userCopy);
  }



}
