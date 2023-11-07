import { Injectable } from "@angular/core";
import { HttpClient } from "@angular/common/http";
import { Observable } from "rxjs";

import { BookingRequest } from "../model";

const API_URL = 'http://localhost:8080/api';

@Injectable()
export class BookingService {

  constructor(private httpClient: HttpClient) {}

  bookTimeSlot(body: BookingRequest): Observable<string> {
    return this.httpClient.post(`${API_URL}/book`, body, {responseType: 'text'});
  }

  // Promise version
  // bookTimeSlot(body: BookingRequest): Promise<Response> {
  //   return fetch(API_URL, {
  //     method: 'POST',
  //     body: JSON.stringify(body),
  //     headers: {
  //       "Content-Type": "application/json",
  //     }
  //   });
  // }

  getAllBookings(): Observable<BookingRequest[]> {
    return this.httpClient.get<BookingRequest[]>(`${API_URL}/bookings`);
  }
}
