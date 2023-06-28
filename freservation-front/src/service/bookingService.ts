import { Injectable } from "@angular/core";
import { HttpClient } from "@angular/common/http";
import { Observable } from "rxjs";

import { BookingRequest } from "../model";

const bookUrl = 'http://localhost:8080/api/book';

@Injectable()
export class BookingService {

  constructor(private httpClient: HttpClient) {}

  bookTimeSlot(body: BookingRequest): Observable<string> {
    return this.httpClient.post(bookUrl, body, {responseType: 'text'});
  }
}
