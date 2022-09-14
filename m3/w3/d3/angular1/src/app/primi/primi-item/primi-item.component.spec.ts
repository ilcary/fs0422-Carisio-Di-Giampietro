import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PrimiItemComponent } from './primi-item.component';

describe('PrimiItemComponent', () => {
  let component: PrimiItemComponent;
  let fixture: ComponentFixture<PrimiItemComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PrimiItemComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PrimiItemComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
