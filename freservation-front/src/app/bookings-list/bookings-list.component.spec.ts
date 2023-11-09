import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BookingsListComponent } from './bookings-list.component';
import { HttpClientTestingModule } from "@angular/common/http/testing";

describe('BookingsListComponent', () => {
  let component: BookingsListComponent;
  let fixture: ComponentFixture<BookingsListComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      imports: [
        BookingsListComponent,
        HttpClientTestingModule
      ]
    });
    fixture = TestBed.createComponent(BookingsListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
