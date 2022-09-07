import { Component, Input, OnInit } from '@angular/core';
import { User } from 'src/app/Models/user';

@Component({
  selector: 'app-utenti-card',
  templateUrl: './utenti-card.component.html',
  styleUrls: ['./utenti-card.component.css']
})
export class UtentiCardComponent implements OnInit {

  @Input() utenti!:User[];


  constructor() { }

  ngOnInit(): void {
  }

}
