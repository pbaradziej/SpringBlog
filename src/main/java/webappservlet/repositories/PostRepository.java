package webappservlet.repositories;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import webappservlet.data.DTO.PostDTO;
import webappservlet.data.Post;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    @Query("SELECT p FROM Post p LEFT JOIN FETCH p.author ORDER BY p.id desc")
    List<Post> findall(Pageable pageable);

    @Query("SELECT p from Post p LEFT JOIN FETCH p.author where p.category = :category ORDER BY p.id desc")
    List<Post> findCategory(@Param("category")String category,Pageable pageable);

    @Query("SELECT new webappservlet.data.DTO.PostDTO(p.id,p.title,p.category,p.author.author_id,p.date,p.img,p.body) from Post p order by p.id desc")
    List<PostDTO> showbypage(Pageable pageable);

    @Query("SELECT new webappservlet.data.DTO.PostDTO(p.id,p.title,p.category,p.author.author_id,p.date,p.img,p.body) from Post p order by p.id desc")
    List<PostDTO> showposts();

    @Query("Select new webappservlet.data.DTO.PostDTO(p.id,p.title,p.category,p.author.author_id,p.date,p.img,p.body) from Post p where p.id = :id")
    PostDTO getById(@Param("id")Long id);

    @Modifying
    @Query(value = "UPDATE Post p set p.id = :#{#post.id},p.title = :#{#post.title}, p.category = :#{#post.category}, p.author.author_id = :#{#post.author_id}, p.date = :#{#post.date},p.img = :#{#post.img},p.body = :#{#post.body} where p.id = :#{#post.id}")
    void updatepost(@Param("post") PostDTO post);

}

