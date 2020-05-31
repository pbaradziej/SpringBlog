package webappservlet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import webappservlet.data.DTO.UserDTO;
import webappservlet.data.User;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);

    @Query("Select new webappservlet.data.DTO.UserDTO(u.author_id,u.username,u.email,u.password,u.role) from User u order by u.author_id desc")
    List<UserDTO> showusers();

    @Query("Select new webappservlet.data.DTO.UserDTO(u.author_id,u.username,u.email,u.password,u.role) from User u where u.author_id  = :id")
    UserDTO getById(@Param("id")Long id);

}
