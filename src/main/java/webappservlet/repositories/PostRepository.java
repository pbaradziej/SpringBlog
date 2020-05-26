package webappservlet.repositories;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import webappservlet.data.Post;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    @Query("SELECT p FROM Post p LEFT JOIN FETCH p.author ORDER BY p.id desc")
    List<Post> findall(Pageable pageable);

    @Query("SELECT p from Post p where p.category = :category")
    List<Post> findCategory(@Param("category")String Category,Pageable pageable);

}

