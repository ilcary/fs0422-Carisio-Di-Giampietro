import { Component,Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-utenti-card',
  templateUrl: './utenti-card.component.html',
  styleUrls: ['./utenti-card.component.css']
})
export class UtentiCardComponent implements OnInit {

  @Input() utenti!:any;

  constructor() { }

  ngOnInit(): void {
  }

}
