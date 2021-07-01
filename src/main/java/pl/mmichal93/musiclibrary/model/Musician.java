package pl.mmichal93.musiclibrary.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
@DiscriminatorValue(value = "Musician")
public class Musician extends Member {
    private String instrument;
    @ManyToOne
    @JsonBackReference
    private Band band;

    public Musician(String name, String surname, LocalDate birthDay, String instrument, Band band) {
        super(name, surname, birthDay);
        this.instrument = instrument;
        this.band = band;
    }

    public Musician() {
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public Band getBand() {
        return band;
    }

    public void setBand(Band band) {
        this.band = band;
    }
}
