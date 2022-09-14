import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PizzeDetailComponent } from './pizze-detail.component';

describe('PizzeDetailComponent', () => {
  let component: PizzeDetailComponent;
  let fixture: ComponentFixture<PizzeDetailComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PizzeDetailComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PizzeDetailComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
