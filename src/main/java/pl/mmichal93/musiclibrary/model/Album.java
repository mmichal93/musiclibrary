package pl.mmichal93.musiclibrary.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private LocalDate releaseDate;
    @ManyToOne
    private Band band;
    @ManyToOne
    private Producer producer;
    private String coverUri;

    public Album(Long id, String title, LocalDate releaseDate, Band band, Producer producer, String coverUri) {
        this.id = id;
        this.title = title;
        this.releaseDate = releaseDate;
        this.band = band;
        this.producer = producer;
        this.coverUri = coverUri;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Band getBand() {
        return band;
    }

    public void setBand(Band band) {
        this.band = band;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    public String getCoverUri() {
        return coverUri;
    }

    public void setCoverUri(String coverUri) {
        this.coverUri = coverUri;
    }

}
