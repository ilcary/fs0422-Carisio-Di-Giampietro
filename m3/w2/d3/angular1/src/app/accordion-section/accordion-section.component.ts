import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-accordion-section',
  templateUrl: './accordion-section.component.html',
  styleUrls: ['./accordion-section.component.scss']
})
export class AccordionSectionComponent implements OnInit {

  @Input() itemId!: string;

  constructor() { }

  ngOnInit(): void {
  }

}
