import { Component, ElementRef, OnInit, ViewChild } from '@angular/core';
import { NgForm, NgModel } from '@angular/forms';

@Component({
  selector: 'app-ng-submit',
  templateUrl: './ng-submit.component.html',
  styleUrls: ['./ng-submit.component.scss']
})
export class NgSubmitComponent implements OnInit {

 //@ViewChild('form', {static:true}) form!:ElementRef// grazie a questa proprietà
 //posso raggiungere il riferimento al form da qualsiasi punto della classe

  constructor() { }

  ngOnInit(): void {

  }

  ngAfterViewInit(): void {
    //console.log(this.form);

  }

  submit(form:NgForm){
    console.dir(form);
    console.log(form.value)

  }

  checkValidity(field:NgModel){
    return field.invalid && field.touched && field.dirty
  }

}
