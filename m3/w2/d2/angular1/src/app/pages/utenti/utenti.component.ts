import { Component, OnInit } from '@angular/core';
import { User } from 'src/app/Models/user';

@Component({
  selector: 'app-utenti',
  templateUrl: './utenti.component.html',
  styleUrls: ['./utenti.component.css']
})
export class UtentiComponent implements OnInit {

  //ricordarsi di tipizzare
  utenti:User[] = [
    {
      id: 1,
      name: "Leanne Graham",
      email: "Sincere@april.biz"
    },
    {
      id: 2,
      name: "Ervin Howell",
      email: "Shanna@melissa.tv"
    }
  ]

  newUser:User = new User('Mario','info@mario.it');

  constructor() { }

  ngOnInit(): void {
  }

  addUser(event:Event):void{
    let userCopy = Object.assign({}, this.newUser);
    this.utenti.push(userCopy);
    this.newUser = new User('','');

    console.log(event)
  }

}
