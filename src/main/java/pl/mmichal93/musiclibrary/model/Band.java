package pl.mmichal93.musiclibrary.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Band {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String bandName;
    @OneToMany(mappedBy = "band")
    private List<Musician> musicians;
    @OneToMany(mappedBy = "band")
    private List<Album> albums;
    private String genre;

    public Band(Long id, String bandName, List<Musician> musicians, List<Album> albums, String genre) {
        this.id = id;
        this.bandName = bandName;
        this.musicians = musicians;
        this.albums = albums;
        this.genre = genre;
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
