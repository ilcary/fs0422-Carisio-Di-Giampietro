import { ComponentFixture, TestBed } from '@angular/core/testing';

import { InactivePostComponent } from './inactive-post.component';

describe('InactivePostComponent', () => {
  let component: InactivePostComponent;
  let fixture: ComponentFixture<InactivePostComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ InactivePostComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(InactivePostComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
