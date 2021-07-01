package pl.mmichal93.musiclibrary.repo;

import org.springframework.stereotype.Repository;
import pl.mmichal93.musiclibrary.model.Musician;

@Repository
public interface MusicianRepo extends MemberRepo<Musician>{
}
