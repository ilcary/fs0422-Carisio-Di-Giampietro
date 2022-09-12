import { Component, OnInit } from '@angular/core';
import { filter, map, Observable, Subscription } from 'rxjs';

@Component({
  selector: 'app-interval2',
  templateUrl: './interval2.component.html',
  styleUrls: ['./interval2.component.scss']
})
export class Interval2Component implements OnInit {

  constructor() { }

  sub!:Subscription;

  ngOnInit(): void {

    function customInterval(time:number){
        return new Observable(observable => {

        let count = 0;

        setInterval(()=>{
          observable.next(count);
          count++;

          if(count > 10){
            observable.error('Numero troppo grande')//unsubscribe automatico
          }

          if(count == 10){
            observable.complete();
          }

        },time)


      })
    }

    this.sub = customInterval(1000)
    .pipe(
      filter(n => (<number>n) > 2  ),//salto i primi 3 valori
      map(n => `Siamo al n° ${n}` ),//modifico ogni valore
    )
    .subscribe({
      next:n=> console.log(n),
      error: error=> console.log(error),
      complete: () => console.log('completato')
    })

    /**
     * customInterval(1000).subscribe(res => console.log(res))
     */

  }

  ngOnDestroy(): void {
    this.sub.unsubscribe()
  }

}
