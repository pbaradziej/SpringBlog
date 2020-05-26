package webappservlet.data;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String category;
    private String body;
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private User author;
    private Date date = new Date();
    private String img;

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public User getAuthor() { return author; }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", author=" + author +
                ", date=" + date +
                '}';
    }

    public void setAuthor(User author) { this.author = author; }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Post() {
    }

    public Post(Long id, String title,String category, String body, User author) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.author = author;
        this.category = category;
    }

    }
