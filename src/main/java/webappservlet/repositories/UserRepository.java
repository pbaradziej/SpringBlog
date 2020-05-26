package webappservlet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import webappservlet.data.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
