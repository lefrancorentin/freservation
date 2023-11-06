package fr.korantun.freservation.data;

import fr.korantun.freservation.model.BookingRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface BookingsRepository extends JpaRepository<BookingRequest, Long> { }
