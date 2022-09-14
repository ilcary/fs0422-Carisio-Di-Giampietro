import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-primi-item',
  templateUrl: './primi-item.component.html',
  styleUrls: ['./primi-item.component.scss']
})
export class PrimiItemComponent implements OnInit {

  @Input() primo!:string
  constructor() { }

  ngOnInit(): void {
  }

}
