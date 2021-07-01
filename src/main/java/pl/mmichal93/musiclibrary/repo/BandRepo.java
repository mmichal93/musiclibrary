package pl.mmichal93.musiclibrary.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.mmichal93.musiclibrary.model.Band;

public interface BandRepo extends JpaRepository<Band,Long> {
}
