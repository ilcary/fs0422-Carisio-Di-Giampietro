import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { User } from '../user';

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
  styleUrls: ['./form.component.css'],
})
export class FormComponent {

 @Output() onNewUserCreated = new EventEmitter<User>()

  constructor() {}

  newUser: User = new User('', '');

  sendDataToParent() {
    this.onNewUserCreated.emit(this.newUser)//invio di dati ai genitori
  }
}
