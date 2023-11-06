import { CommonModule } from '@angular/common';
import { Component, inject } from '@angular/core';
import { FormsModule, NgForm } from '@angular/forms';

import { BookingRequest, LanguageLevel } from "../../model";
import { BookingService } from 'src/service/bookingService';
import { HttpClientModule, HttpErrorResponse } from '@angular/common/http';

@Component({
  selector: 'app-registration-form',
  standalone: true,
  imports: [
    CommonModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [BookingService],
  templateUrl: './registration-form.component.html',
  styleUrls: ['./registration-form.component.scss']
})
export class RegistrationFormComponent {

  bookingService = inject(BookingService);
  log = "";

  EMAIL_PATTERN  = /[\w.]*\w+@\w+\.\w+/

  // voir si reactiveForms c'est mieux plus tard
  // firstNameFormControl = new FormControl();
  // lastNameFormControl = new FormControl();
  // reactive devrait être plus rapide, faire des tests ? https://angular.io/guide/forms-overview#mutability-of-the-data-model
  levels = LanguageLevel;

  firstNameLabel = "firstname";
  lastNameLabel = "lastname";
  levelLabel = "level";
  emailLabel = "email";
  startingTimeLabel = "startingTime"
  endingTimeLabel = "endingTime";

  firstNameValue = "Default Name";
  lastNameValue = "Default Name";
  levelValue!: LanguageLevel;
  emailValue = "";
  startingTimeValue= "";
  endingTimeValue = "";

  onSubmit(ngForm: NgForm) {
    if(ngForm.form.valid) {
      this.bookingService.bookTimeSlot(this.constructRequestFromFormValues()).subscribe({
        next: (response: string) => {
          this.log = response;
        },
        error: (error: HttpErrorResponse) => {
          // TODO: 400 OK ?
          console.log(error);
          this.log = error.message;
        }});
    }
  }

  private constructRequestFromFormValues(): BookingRequest {
    return {
      firstname: this.firstNameValue,
      lastname: this.lastNameValue,
      level: this.levelValue,
      email: this.emailValue,
      startTime: new Date(this.startingTimeValue).toISOString(),
      endingTime: new Date(this.endingTimeValue).toISOString(),
    } as BookingRequest
  }
}
