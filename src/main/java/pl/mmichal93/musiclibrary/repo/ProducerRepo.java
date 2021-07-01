package pl.mmichal93.musiclibrary.repo;

import org.springframework.stereotype.Repository;
import pl.mmichal93.musiclibrary.model.Producer;

@Repository
public interface ProducerRepo extends MemberRepo<Producer> {
}
