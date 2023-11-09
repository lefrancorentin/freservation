import { Component } from '@angular/core';
import { RouterModule } from '@angular/router';

import { RegistrationFormComponent } from './registration-form/registration-form.component';

@Component({
  selector: 'app-root',
  standalone: true,
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss'],
  imports: [
    RegistrationFormComponent,
    RouterModule
  ]
})
export class AppComponent {
  title = 'freservation-front';
}
