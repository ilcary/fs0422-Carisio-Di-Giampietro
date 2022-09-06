import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UtentiDettaglioComponent } from './utenti-dettaglio.component';

describe('UtentiDettaglioComponent', () => {
  let component: UtentiDettaglioComponent;
  let fixture: ComponentFixture<UtentiDettaglioComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ UtentiDettaglioComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(UtentiDettaglioComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
