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
    @OneToMany(mappedBy = "author")
    private Set<Post> post = new HashSet<>();

    public Long getId() { return author_id; }
    public void setId(Long id) { this.author_id = id; }
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public Set<Post> getPosts() { return post; }
    public void setPosts(Set<Post> posts) { this.post = posts; }
    public User() { }

    public User(Long id, String username, String email) {
        this.author_id = id; this.username = username; this.email=email;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + author_id + ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", fullName='" + email + '\'' + '}';
    }
}
