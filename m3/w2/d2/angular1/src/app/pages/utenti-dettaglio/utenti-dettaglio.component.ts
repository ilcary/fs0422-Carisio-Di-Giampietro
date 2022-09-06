import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-utenti-dettaglio',
  templateUrl: './utenti-dettaglio.component.html',
  styleUrls: ['./utenti-dettaglio.component.css'],
})
export class UtentiDettaglioComponent implements OnInit {



  constructor(private route:ActivatedRoute){ }// ci fornisce la rotta

  userId!:string //

  ngOnInit(): void {
    this.userId = this.route.snapshot.params['id']//parametri passati nell'url

  }

}
