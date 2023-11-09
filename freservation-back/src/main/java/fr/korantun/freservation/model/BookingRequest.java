package fr.korantun.freservation.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity(name = "bookings")
public class BookingRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String firstname;

    @NotBlank
    private String lastname;

    // pète une erreur de deserialization (traduite en http 400) si le json de requete ne fait pas partie de l'enum. Customiser cette erreur ?
    @NotNull
    @Column(name = "languagelevel")
    @Enumerated(EnumType.STRING)
    private LanguageLevel level;

    @NotBlank
    private String email;

    @NotNull
    @Column(name = "startdate")
    private LocalDateTime startTime;

    @NotNull
    @Column(name = "enddate")
    private LocalDateTime endingTime;

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "bookingdate", insertable = false)
    private LocalDateTime bookingTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public LanguageLevel getLevel() {
        return level;
    }

    public String getEmail() {
        return email;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndingTime() {
        return endingTime;
    }

    public void setFirstname(final String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(final String lastname) {
        this.lastname = lastname;
    }

    public void setLevel(final LanguageLevel level) {
        this.level = level;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public void setStartTime(final LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public void setEndingTime(final LocalDateTime endingTime) {
        this.endingTime = endingTime;
    }

    public LocalDateTime getBookingTime() {
        return bookingTime;
    }

    public void setBookingTime(LocalDateTime bookingTime) {
        this.bookingTime = bookingTime;
    }
}
