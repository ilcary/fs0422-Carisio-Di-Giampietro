import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PrimiListComponent } from './primi-list.component';

describe('PrimiListComponent', () => {
  let component: PrimiListComponent;
  let fixture: ComponentFixture<PrimiListComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PrimiListComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PrimiListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
