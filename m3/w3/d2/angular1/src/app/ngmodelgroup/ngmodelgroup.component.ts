import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-ngmodelgroup',
  templateUrl: './ngmodelgroup.component.html',
  styleUrls: ['./ngmodelgroup.component.scss']
})
export class NgmodelgroupComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  userForm:any = {
    name: '',
    lastname: '',
    street: '',
    city: '',
    zipcode: ''
  }

  submit(form:NgForm){
    console.log(form)
  }

}
