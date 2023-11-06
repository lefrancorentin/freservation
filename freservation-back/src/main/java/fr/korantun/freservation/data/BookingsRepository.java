package fr.korantun.freservation.data;

import fr.korantun.freservation.model.BookingRequest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface BookingsRepository extends CrudRepository<BookingRequest, Long> { }
