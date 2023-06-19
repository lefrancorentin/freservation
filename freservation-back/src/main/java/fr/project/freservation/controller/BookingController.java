package fr.project.freservation.controller;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import fr.project.freservation.model.BookingRequest;

@RestController
// à mettre à un plus haut niveau ? sinon je répète /api pour tous mes controllers
@RequestMapping("api")
public class BookingController {

    @PostMapping("/book")
    public ResponseEntity<String> bookTimeSlot(@RequestBody @Valid BookingRequest request) {
        return ResponseEntity.ok(request.getFirstname() + " made a reservation");
    }
}
