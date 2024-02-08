import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ExpertprofileComponent } from './expertprofile.component';

describe('ExpertprofileComponent', () => {
  let component: ExpertprofileComponent;
  let fixture: ComponentFixture<ExpertprofileComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ExpertprofileComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(ExpertprofileComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
