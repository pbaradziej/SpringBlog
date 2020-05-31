package webappservlet.services;

import webappservlet.data.Post;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class PostServiceImpl implements PostService {
    private List<Post> posts = new ArrayList<Post>() {{
        add(new Post(1L, "Imperdiet consequat","sport", "<p>Sunt in culpa qui officia deserunt mollit anim id est laborum consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco.</p>" +
                "        ", null));
        add(new Post(2L, "Mattis vehicula","sport", "Sunt in culpa qui officia deserunt mollit anim id est laborum consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco.</p>",null));
        add(new Post(3L, "bibendum fusc","sport", "Sunt in culpa qui officia deserunt mollit anim id est laborum consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco.</p>",null));
        add(new Post(4L, "parturient commodo","sport", "<p>Sunt in culpa qui officia deserunt mollit anim id est laborum consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco.</p>", null));
        add(new Post(5L, "Risus mauris","sport", "<p>Etiam ac et nam, et viverra malesuada faucibus eget consequat curae; tellus nisl. Elit ornare risus fames conubia nisl dignissim. Diam ligula ullamcorper dolor. Mollis hac. Mi odio suspendisse consequat na.</p>", null));
        add(new Post(6L, "Sem dictum","sport", "<p>Curae; diam nulla, quisque pellentesque amet fermentum. Pulvinar primis rhoncus congue scelerisque id felis arcu nullam dictumst orci donec in Pretium id facilisi aenean in magnis gravida per aliquam magnis dui inceptos morbi sodales.</p>", null));
    }};

    @Override
    public List<Post> findAll() {
        return this.posts;
    }

    @Override
    public List<Post> view5posts(int page) {
        return this.posts.stream()
                .sorted((a, b) -> b.getDate().compareTo(a.getDate()))
                .limit(5)
                .collect(Collectors.toList());
    }

    @Override
    public Post findById(Long id) {
        return null;
    }

    @Override
    public Post create(Post post) {
        return null;
    }
    @Override
    public List<Post> findCategory(String category,int page){
        return null;
    }

    @Override
    public Post edit(Post post) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}