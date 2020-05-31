package webappservlet.data.DTO;

public class UserDTO {

    private Long author_id;
    private String username;
    private String email;
    private String password;
    private String role;

    public UserDTO(Long author_id, String username, String email, String password, String role) {
        this.author_id = author_id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public Long getAuthor_id() { return author_id; }

    public String getUsername() { return username; }

    public String getEmail() { return email; }

    public String getPassword() { return password; }

    public String getRole() { return role; }

}
