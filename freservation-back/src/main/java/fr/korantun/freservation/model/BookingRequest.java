package fr.korantun.freservation.model;

import java.time.LocalDateTime;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class BookingRequest {

    @NotBlank
    private String firstname;
    @NotBlank
    private String lastname;

    // pète une erreur de deserialization (traduite en http 400) si le json de requete ne fait pas partie de l'enum. Customiser cette erreur ?
    @NotNull
    private LanguageLevel level;
    @NotBlank
    private String email;
    @NotNull
    private LocalDateTime startTime;
    @NotNull
    private LocalDateTime endingTime;

    public String getFirstname() {
        return firstname;
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
}
