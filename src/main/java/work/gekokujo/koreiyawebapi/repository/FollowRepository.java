package work.gekokujo.koreiyawebapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import work.gekokujo.koreiyawebapi.domain.Follow;

public interface FollowRepository extends JpaRepository<Follow, Long> {

     Long countByFollowId(Long followId);

     Long countByIntegerFollowId(Long IntegerFollowId);

     Follow findByFollowIdAndInverseFollowId(Long followId, Long inverseFollowId);


}
