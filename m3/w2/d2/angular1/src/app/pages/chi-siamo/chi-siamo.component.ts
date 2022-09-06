import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-chi-siamo',
  templateUrl: './chi-siamo.component.html',
  styleUrls: ['./chi-siamo.component.css']
})
export class ChiSiamoComponent implements OnInit {

  title:string = 'Chi siamo';

  constructor() { }

  ngOnInit(): void {
  }

}
