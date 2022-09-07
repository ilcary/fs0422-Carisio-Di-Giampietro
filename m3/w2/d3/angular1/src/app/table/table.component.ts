import { Component, Input, OnInit } from '@angular/core';
import { User } from '../user';

@Component({
  selector: 'app-table',
  templateUrl: './table.component.html',
  styleUrls: ['./table.component.css'],
})
export class TableComponent implements OnInit {



@Input() allItems!: User[]
 props:string[] = (Object.keys(new User('','')))  //mi restituisce i nomi delle proprietà e dei metodi

constructor() {}


ngOnInit(): void {
  this.props.push('Azioni')
}

}
