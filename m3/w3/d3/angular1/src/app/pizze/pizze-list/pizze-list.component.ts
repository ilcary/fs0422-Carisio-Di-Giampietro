import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-pizze-list',
  templateUrl: './pizze-list.component.html',
  styleUrls: ['./pizze-list.component.scss']
})
export class PizzeListComponent implements OnInit {

  pizze: string[] = [
    'Margherita',
    'Diavola',
    'Capricciosa'
  ]

  constructor() { }

  ngOnInit(): void {
  }

}
