package pl.mmichal93.musiclibrary.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.List;

@Entity
@DiscriminatorValue(value = "Producer")
public class Producer extends Member {
    private boolean hasStudio;
    @OneToMany(mappedBy = "producer")
    private List<Album> albums;


    public Producer(Long id, String name, String surname, LocalDate birthDay, boolean hasStudio, List<Album> albums) {
        super(id, name, surname, birthDay);
        this.hasStudio = hasStudio;
        this.albums = albums;
    }

    public boolean isHasStudio() {
        return hasStudio;
    }

    public void setHasStudio(boolean hasStudio) {
        this.hasStudio = hasStudio;
    }

    public List<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }
}
