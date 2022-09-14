import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-home',
  template: `
<h1  class="text-center"><span appHighlight>Benvenuto</span> sulla home page</h1>
  <div class=" mt-5 d-flex  justify-content-around">
    <button (click)="gotoActivePosts()" class="btn btn-primary" >vai a post attivi</button>
    <button (click)="gotoInactivePosts()" class="btn btn-primary" >vai a post non attivi</button>
  </div>
  `,
  styles: [
  ]
})
export class HomePage implements OnInit {

  constructor(private router:Router) { }

  ngOnInit(): void {
  }
  gotoInactivePosts(){
    this.router.navigate(['/inactive-posts'])
  }
  gotoActivePosts(){
    this.router.navigate(['/active-posts'])
  }

}
