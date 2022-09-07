import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { User } from '../Models/user';

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
  styleUrls: ['./form.component.scss']
})
export class FormComponent {

  @Output() onNewUserCreated = new EventEmitter<User>();

  newUser:User = new User('','');

  sendDataToParent(){
    this.onNewUserCreated.emit(this.newUser);//invio dati al genitore
  }
}
