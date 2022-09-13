import { Component, OnInit } from '@angular/core';
import { FormArray, FormControl, FormGroup, Validators } from '@angular/forms';
import { Eroe } from 'src/app/eroe';

@Component({
  selector: 'app-new-hero-reactive',
  templateUrl: './new-hero-reactive.component.html',
  styleUrls: ['./new-hero-reactive.component.scss'],
})
export class NewHeroReactiveComponent implements OnInit {

  constructor() {}

  form!: FormGroup;

  allHeroes: Eroe[] = [];

  ngOnInit(): void {
    this.form= new FormGroup(
      {
        name:new FormControl(null, Validators.required),
        alterEgo:new FormControl(null, Validators.required),
        power:new FormArray([new FormControl(null)]),
        enemy:new FormControl(null, [Validators.required, Validators.maxLength(10)]),
        planet:new FormControl(null, [Validators.required, Validators.minLength(5)]),
        weakness:new FormArray([]),
      }
      )
  }

  addWeakness(){
    let control:FormControl = new FormControl(null)
    let weakness = <FormArray>this.form.get('weakness')
    weakness.push(control)
  }

  getWeakness(){
    return (<FormArray>this.form.get('weakness')as FormArray).controls
  }
  addPower(){
    let control:FormControl = new FormControl(null)
    let power = <FormArray>this.form.get('power')
    power.push(control)
  }

  getPower(){
    return (<FormArray>this.form.get('power')as FormArray).controls
  }

  submit() {
    this.allHeroes.push(this.form.value);
    this.form.reset();
    console.log(this.form.value);

  }

  checkValidity(field:any) {
    return field.invalid && field.touched && field.dirty;
  }
}
