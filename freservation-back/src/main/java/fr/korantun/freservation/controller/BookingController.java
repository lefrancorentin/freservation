package fr.korantun.freservation.controller;

import javax.validation.Valid;

import fr.korantun.freservation.data.BookingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import fr.korantun.freservation.model.BookingRequest;

import java.util.Optional;

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

    @GetMapping("/db")
    public ResponseEntity<BookingRequest> fetchFromDb()
 {
        Optional<BookingRequest> bookingFromDb = bookingsRepository.findById(2L);
        System.out.println(bookingFromDb);
        return ResponseEntity.ok(bookingFromDb.orElse(null));
    }
}
