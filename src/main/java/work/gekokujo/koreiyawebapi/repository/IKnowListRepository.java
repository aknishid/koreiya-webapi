package work.gekokujo.koreiyawebapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import work.gekokujo.koreiyawebapi.domain.IKnowList;

/**
 * Created by aini on 2018/05/20.
 */
public interface IKnowListRepository extends JpaRepository<IKnowList,Long> {
    Long countByContentId(Long contentId);
}
