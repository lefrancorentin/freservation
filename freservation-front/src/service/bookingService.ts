import { Injectable } from "@angular/core";
import { HttpClient } from "@angular/common/http";
import { Observable } from "rxjs";

import { BookingRequest } from "../model";

const BOOK_URL = 'http://localhost:8080/api/book';

@Injectable()
export class BookingService {

  constructor(private httpClient: HttpClient) {}

  bookTimeSlot(body: BookingRequest): Observable<string> {
    return this.httpClient.post(BOOK_URL, body, {responseType: 'text'});
  }

  // Promise version
  // bookTimeSlot(body: BookingRequest): Promise<Response> {
  //   return fetch(BOOK_URL, {
  //     method: 'POST',
  //     body: JSON.stringify(body),
  //     headers: {
  //       "Content-Type": "application/json",
  //     }
  //   });
  // }
}
