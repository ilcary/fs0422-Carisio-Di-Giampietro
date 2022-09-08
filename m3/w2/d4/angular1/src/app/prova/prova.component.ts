import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-prova',
  templateUrl: './prova.component.html',
  styleUrls: ['./prova.component.scss']
})
export class ProvaComponent implements OnInit {

  constructor(
    private route: ActivatedRoute,
    private router: Router,
    ) { }

  id:number = 0;
  nome:string = 'Mario';

  ngOnInit(): void {
    //this.id = this.route.snapshot.params['id'];
    //this.nome = this.route.snapshot.params['nome'];

    this.route.params.subscribe((params:any) => {
      this.id = params.id;
      this.nome = params.nome;
    })
  }

  redirect(){
    this.router.navigate(['/prova',5,'Giovanna'])
  }

}
