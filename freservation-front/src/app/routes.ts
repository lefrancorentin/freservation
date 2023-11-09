import { Routes } from "@angular/router";
import { RegistrationFormComponent } from "./registration-form/registration-form.component";
import { BookingsListComponent } from "./bookings-list/bookings-list.component";

const routeConfig: Routes = [
  {
    path: '',
    component: RegistrationFormComponent,
    title: 'Registration page'
  },
  {
    path: 'bookings',
    component: BookingsListComponent,
    title: 'Booking List'
  }
]

export default routeConfig;
