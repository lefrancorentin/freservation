import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { Level } from "../../model/Level";

@Component({
  selector: 'app-registration-form',
  standalone: true,
  imports: [
    CommonModule,
    FormsModule
  ],
  templateUrl: './registration-form.component.html',
  styleUrls: ['./registration-form.component.scss']
})
export class RegistrationFormComponent {

  // voir si reactiveForms c'est mieux plus tard
  // firstNameFormControl = new FormControl();
  // lastNameFormControl = new FormControl();
  levels = Level;

  firstNameLabel = "firstname";
  lastNameLabel = "lastname";
  levelLabel = "level";
  emailLabel = "email";
  startingTimeLabel = "startingTime"
  endingTimeLabel = "endingTime";

  firstNameValue = "Default Name";
  lastNameValue = "Default Name";
  levelValue = "";
  emailValue = "";
  startingTimeValue = ""; // DateObject ? now ?
  endingTimeValue = "";
}
