import { Component, Input, OnInit } from '@angular/core';
import { User } from '../Models/user';

@Component({
  selector: 'app-table',
  templateUrl: './table.component.html',
  styleUrls: ['./table.component.scss']
})
export class TableComponent implements OnInit {

  @Input() allItems!:User[];

  props:string[] = Object.keys(new User('',''));


  constructor() { }

  ngOnInit(): void {
    this.props.push('Azioni')
  }

}
