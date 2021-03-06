package webappservlet.data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long author_id;
    private String username;
    private String password;
    private String email;
    private String role = "ROLE_USER";

    private String admin="admin";

    @OneToMany(mappedBy = "author")
    private Set<Post> post = new HashSet<>();

    public User() {
    }

    public User(Long id, String username, String email) {
        this.author_id = id; this.username = username; this.email=email;
    }

    public String getAdmin(){return admin;}
    public Long getId() { return author_id; }
    public void setId(Long id) { this.author_id = id; }
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }
    public Set<Post> getPosts() { return post; }
    public void setPosts(Set<Post> posts) { this.post = posts; }


    @Override
    public String toString() {
        return "User{" + "id=" + author_id + ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", fullName='" + email + '\'' + '}';
    }
}
