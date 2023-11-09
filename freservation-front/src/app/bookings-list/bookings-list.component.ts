import { Component, inject, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { BookingRequest } from "../../model";
import { BookingService } from "../../service/bookingService";

@Component({
  selector: 'app-bookings-list',
  standalone: true,
  imports: [CommonModule],
  providers: [BookingService],
  templateUrl: './bookings-list.component.html',
  styleUrls: ['./bookings-list.component.scss']
})
export class BookingsListComponent implements OnInit {

  bookingService = inject(BookingService);
  bookingRequests: BookingRequest[] = [];

  ngOnInit(): void {
    this.bookingService.getAllBookings().subscribe({
      next: (value: BookingRequest[]) => {
        this.bookingRequests = value
      }
    });
  }
}
