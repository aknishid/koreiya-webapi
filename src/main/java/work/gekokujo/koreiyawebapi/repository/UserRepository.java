package work.gekokujo.koreiyawebapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import work.gekokujo.koreiyawebapi.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUniquedId();
}
