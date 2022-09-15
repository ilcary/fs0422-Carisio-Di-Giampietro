import { Component } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { environment } from 'src/environments/environment';
import { ModalContentComponent } from './modal-content/modal-content.component';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'material';


  dati:any = {name: 'Mario'}

  constructor(public dialog: MatDialog) {}

  openDialog(){
    const dialogRef = this.dialog.open(ModalContentComponent,{
      width: '250px',
      data: this.dati
    });

    dialogRef.afterClosed().subscribe(result => {
      console.log(`Dialog result: ${result}`);
    });
  }




  /** esperimenti con cdk */

  items:any[] = Array(100000).fill(1).map((_,i)=> `Elemento n° ${i}` )

  ngOnInit(): void {
    console.log(this.items)

    console.log(environment.apiUrl)
  }
}
