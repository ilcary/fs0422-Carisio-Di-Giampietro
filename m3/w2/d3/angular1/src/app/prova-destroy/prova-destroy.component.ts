import { Component, OnDestroy, OnInit } from '@angular/core';

@Component({
  selector: 'app-prova-destroy',
  templateUrl: './prova-destroy.component.html',
  styleUrls: ['./prova-destroy.component.scss']
})
export class ProvaDestroyComponent implements OnInit, OnDestroy {

  constructor() { }

  ngOnInit(): void {
    console.log('Componente inizializzato')
  }
  ngOnDestroy(): void {
    console.log('Componente distrutto')
  }


}
