package pl.mmichal93.musiclibrary.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import pl.mmichal93.musiclibrary.model.Member;

@NoRepositoryBean
public interface MemberRepo<T extends Member> extends JpaRepository<T,Long> {
}
