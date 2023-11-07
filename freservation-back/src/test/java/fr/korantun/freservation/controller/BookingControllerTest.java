package fr.korantun.freservation.controller;

import fr.korantun.freservation.data.BookingsRepository;
import fr.korantun.freservation.model.BookingRequest;
import fr.korantun.freservation.model.LanguageLevel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;

import java.time.LocalDateTime;

@ExtendWith(MockitoExtension.class)
class BookingControllerTest {

    @Mock
    BookingsRepository bookingsRepository;

    @InjectMocks
    BookingController bookingController;

    @Test
    void whenValidBookingRequestIsPassed_thenResponseHasCode200() {
        // given
        BookingRequest bookingRequest = constructBookingRequest();

        // when
        Mockito.when(bookingsRepository.save(bookingRequest)).thenReturn(bookingRequest);

        ResponseEntity<String> httpResponse = bookingController.bookTimeSlot(bookingRequest);

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