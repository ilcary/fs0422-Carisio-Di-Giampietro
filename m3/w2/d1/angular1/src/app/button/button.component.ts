import { Component, OnInit } from '@angular/core';

@Component({
  selector: '.app-button',
  templateUrl: './button.component.html',
  styleUrls: ['./button.component.css']
})
export class ButtonComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

    /** toggle bottone */

    mostra:boolean = false;

    toggle(){
      this.mostra = !this.mostra
    }

}
