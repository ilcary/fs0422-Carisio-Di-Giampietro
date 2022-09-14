import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PrimiDetailComponent } from './primi-detail.component';

describe('PrimiDetailComponent', () => {
  let component: PrimiDetailComponent;
  let fixture: ComponentFixture<PrimiDetailComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PrimiDetailComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PrimiDetailComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
