import { Component, OnInit } from '@angular/core';
type slide = {
  image: string,
  title: string,
  caption: string
}
@Component({
  selector: 'app-carousel',
  templateUrl: './carousel.component.html',
  styleUrls: ['./carousel.component.scss']
})
export class CarouselComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  images:string[] = [
    "https://images.unsplash.com/photo-1663208542270-c76fc8b3ed9d?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=700&q=60",
    "https://images.unsplash.com/photo-1663000901005-b54afec7e7e3?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=700&q=60",
    "https://images.unsplash.com/photo-1663214532892-57aac8c5149f?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=700&q=60"
  ]

  slides:slide[] = [
    {
      image:'https://images.unsplash.com/photo-1663208542270-c76fc8b3ed9d?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=700&q=60',
      title:'First slide label',
      caption: 'Nulla vitae elit libero, a pharetra augue mollis interdum.'
    },
    {
      image:'https://images.unsplash.com/photo-1663000901005-b54afec7e7e3?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=700&q=60',
      title:'Seconda slide',
      caption: 'Nulla vitae elit libero, a pharetra augue mollis interdum.'
    },
    {
      image:'https://images.unsplash.com/photo-1663214532892-57aac8c5149f?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=700&q=60',
      title:'Third slide label',
      caption: 'Nulla vitae elit libero, a pharetra augue mollis interdum.'
    }
  ]

}
