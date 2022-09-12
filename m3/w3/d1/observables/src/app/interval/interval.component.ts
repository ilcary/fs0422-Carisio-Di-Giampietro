import { Component, OnInit } from '@angular/core';
import { interval, Subscription } from 'rxjs';

@Component({
  selector: 'app-interval',
  templateUrl: './interval.component.html',
  styleUrls: ['./interval.component.scss']
})
export class IntervalComponent implements OnInit {

  constructor() { }

  sub!:Subscription

  ngOnInit(): void {

    this.sub = interval(1000).subscribe(n => console.log(n))

  }

  ngOnDestroy(): void {
    this.sub.unsubscribe()
  }

}
