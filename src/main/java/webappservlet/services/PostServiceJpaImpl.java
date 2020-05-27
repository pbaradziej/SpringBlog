package webappservlet.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.PageRequest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import webappservlet.data.Post;
import webappservlet.repositories.PostRepository;

import java.util.List;

@Service
@Primary
public class PostServiceJpaImpl implements PostService {

    @Autowired
    private PostRepository postRepo;

    @Override
    public List<Post> findAll() {
        return this.postRepo.findAll();
    }

    @Override
    public List<Post> view5posts(int page) {
        return this.postRepo.findall(PageRequest.of(page, 5));
    }

    @Override
    public Post findById(Long id) {
        return this.postRepo.getOne(id);
    }

    @Override
    public List<Post> findCategory(String category){
        return this.postRepo.findCategory(category,PageRequest.of(0,5));
    }

    @Override
    public Post create(Post post) {
        return this.postRepo.save(post);
    }


    @Override
    public Post edit(Post post) {
        return this.postRepo.save(post);
    }

    @Override
    public void deleteById(Long id) {
        this.postRepo.deleteById(id);
    }

}
