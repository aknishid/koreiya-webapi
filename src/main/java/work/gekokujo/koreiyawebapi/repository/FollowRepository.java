package work.gekokujo.koreiyawebapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import work.gekokujo.koreiyawebapi.domain.Follow;

public interface FollowRepository extends JpaRepository<Follow, Long> {

     Long countByFollowId(String followId);

     Long countByIntegerFollowId(String IntegerFollowId);

     Follow findByFollowIdAndInverseFollowId(String followId, String inverseFollowId);


}
