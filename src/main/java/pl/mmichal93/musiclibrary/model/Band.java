package pl.mmichal93.musiclibrary.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class Band {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String bandName;
    @OneToMany(mappedBy = "band")
    @JsonManagedReference
    private List<Musician> musicians;
    @OneToMany(mappedBy = "band")
    @JsonManagedReference
    private List<Album> albums;
    private String genre;

    public Band( String bandName, List<Musician> musicians, List<Album> albums, String genre) {
        this.bandName = bandName;
        this.musicians = musicians;
        this.albums = albums;
        this.genre = genre;
    }

    public Band() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public List<Musician> getMusicians() {
        return musicians;
    }

    public void setMusicians(List<Musician> musicians) {
        this.musicians = musicians;
    }

    public List<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
