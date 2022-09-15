import { Component, Inject, OnInit } from '@angular/core';
import { MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';

@Component({
  selector: 'app-modal-content',
  templateUrl: './modal-content.component.html',
  styleUrls: ['./modal-content.component.scss']
})
export class ModalContentComponent implements OnInit {

  @Inject(MAT_DIALOG_DATA) data!: any
  constructor(
    public dialogRef: MatDialogRef<ModalContentComponent>,
  ) {}

  ngOnInit(): void {
  }

}
