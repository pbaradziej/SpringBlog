package webappservlet.data.DTO;

import java.util.Date;

public class PostDTO {

private Long id;
private String title;
private String category;
private Long author_id;
private Date date;
private String img;
private String body;

    public PostDTO(Long id, String title, String category, Long author_id, Date date, String img, String body) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.author_id = author_id;
        this.date = date;
        this.img = img;
        this.body = body;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public Long getAuthor_id() {
        return author_id;
    }

    public Date getDate() {
        return date;
    }

    public String getImg() {
        return img;
    }

    public String getBody() {
        return body;
    }
}
