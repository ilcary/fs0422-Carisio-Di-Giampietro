import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-list',
  template: `
    <ul class="list-group">
        <ng-content></ng-content>
    </ul>
  `,
  styles: [
  ]
})
export class ListComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

}
