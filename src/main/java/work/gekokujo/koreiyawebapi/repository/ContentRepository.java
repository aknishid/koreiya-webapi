package work.gekokujo.koreiyawebapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import work.gekokujo.koreiyawebapi.domain.Content;

import java.util.List;

/**
 * Created by aini on 2018/05/20.
 */
public interface ContentRepository extends JpaRepository<Content,Long>{
    List<Content> findByUserId(Long id);
}
