package fr.korantun.freservation.controller;

import fr.korantun.freservation.data.BookingsRepository;
import fr.korantun.freservation.model.BookingRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
// à mettre à un plus haut niveau ? sinon je répète /api pour tous mes controllers
@RequestMapping("api")
public class BookingController {

    @Autowired
    BookingsRepository bookingsRepository;

    @PostMapping("/book")
    public ResponseEntity<String> bookTimeSlot(@RequestBody @Valid BookingRequest request) {
        bookingsRepository.save(request);
        return ResponseEntity.ok(request.getFirstname() + " made a reservation");
    }

    @GetMapping("/bookings")
    public List<BookingRequest> getAllBookingRequests() {
        return bookingsRepository.findAll();
    }
}
