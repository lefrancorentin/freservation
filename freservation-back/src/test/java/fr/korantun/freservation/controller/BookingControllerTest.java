package fr.korantun.freservation.controller;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import fr.korantun.freservation.model.BookingRequest;
import fr.korantun.freservation.model.LanguageLevel;

class BookingControllerTest {

    BookingController bookingController = new BookingController();

    @Test
    void whenValidBookingRequestIsPassed_thenResponseHasCode200() {
        // given
        BookingRequest emptyRequest = constructBookingRequest();

        // when
        ResponseEntity<String> httpResponse = bookingController.bookTimeSlot(emptyRequest);

        //then
        Assertions.assertEquals(200, httpResponse.getStatusCodeValue());
    }

    private BookingRequest constructBookingRequest() {
        BookingRequest bookingRequest = new BookingRequest();
        bookingRequest.setFirstname("Korantun");
        bookingRequest.setLastname("Lesincère");
        bookingRequest.setLevel(LanguageLevel.B1);
        bookingRequest.setEmail("lefrancorentin@mail.fr");
        bookingRequest.setStartTime(LocalDateTime.now());
        bookingRequest.setEndingTime(LocalDateTime.now().plusHours(2));
        return bookingRequest;
    }
}