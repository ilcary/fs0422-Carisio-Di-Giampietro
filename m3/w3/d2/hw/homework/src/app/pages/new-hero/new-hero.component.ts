import { Component, OnInit, ViewChild } from '@angular/core';
import { NgForm, NgModel } from '@angular/forms';
import { Eroe } from 'src/app/eroe';

@Component({
  selector: 'app-new-hero',
  templateUrl: './new-hero.component.html',
  styleUrls: ['./new-hero.component.scss']
})
export class NewHeroComponent implements OnInit {

  @ViewChild('form') form!:NgForm;

  constructor() { }

allHeroes:Eroe[]=[]

  ngOnInit(): void {
  }



  submit(form:NgForm){
    this.allHeroes.push(form.form.value)
    console.log(form)
    this.form.reset()
  }

  checkValidity(field:NgModel){
    return field.invalid && field.touched && field.dirty
  }

}
