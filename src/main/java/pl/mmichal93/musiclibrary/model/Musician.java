package pl.mmichal93.musiclibrary.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
public class Musician extends Member {
    private String instrument;
    @ManyToOne
    private Band band;

    public Musician(Long id, String name, String surname, LocalDate birthDay, String instrument, Band band) {
        super(id, name, surname, birthDay);
        this.instrument = instrument;
        this.band = band;
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
