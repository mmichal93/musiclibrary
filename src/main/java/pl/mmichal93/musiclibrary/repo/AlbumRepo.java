package pl.mmichal93.musiclibrary.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import pl.mmichal93.musiclibrary.model.Album;

public interface AlbumRepo extends JpaRepository<Album,Long> {
}
