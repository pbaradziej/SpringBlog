package webappservlet.services;

import webappservlet.data.Post;
import java.util.List;

public interface PostService {
    List<Post> findAll();
    List<Post> view5posts(int page);
    Post findById(Long id);
    Post create(Post post);
    Post edit(Post post);
    List<Post> findCategory(String category,int page);
    void deleteById(Long id);
}
