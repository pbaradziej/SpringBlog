package webappservlet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import webappservlet.data.DTO.PostDTO;
import webappservlet.data.DTO.UserDTO;
import webappservlet.repositories.PostRepository;
import webappservlet.repositories.UserRepository;

import java.util.List;

@RestController
public class Restcontroller {

    @Autowired
    private PostRepository postRepository;
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/posts")
    public List<PostDTO> ShowallPosts(){
        return postRepository.showposts();
    }

    @GetMapping("/posts/page/{page}")
    public List<PostDTO> ShowAllpostsbyPage(@PathVariable(name="page")int page) {
        return postRepository.showbypage(PageRequest.of(page-1, 5)); }

    @GetMapping("/users/{id}")
    public UserDTO getUser(@PathVariable("id")Long id){
        return userRepository.getById(id);
    }

    @GetMapping("/users")
    public List<UserDTO> Showallusers(){
        return userRepository.showusers();
    }

    @GetMapping("/posts/{id}")
    public PostDTO getPost(@PathVariable("id") Long id){ return postRepository.getById(id); }

    @Transactional
    @PostMapping("/posts/update")
    public void updatepost(@RequestBody PostDTO postDTO){
        postRepository.updatepost(postDTO);
    }

}