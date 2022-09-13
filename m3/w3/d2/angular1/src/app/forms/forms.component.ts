import { Component, OnInit } from '@angular/core';

type user = {
  name: string,
  lastname: string,
}

@Component({
  selector: 'app-forms',
  templateUrl: './forms.component.html',
  styleUrls: ['./forms.component.scss']
})
export class FormsComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  userData:user = {
    name: 'Rossana',
    lastname: 'Bianchi'
  }

  email:string = 'test@tets.it'
  message:string = 'ciao'

}
