package work.gekokujo.koreiyawebapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import work.gekokujo.koreiyawebapi.domain.Tag;

/**
 * Created by aini on 2018/05/20.
 */
public interface TagRepository extends JpaRepository<Tag,Long> {
}
