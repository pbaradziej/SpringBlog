package webappservlet.data;

public class Comment {

    private String user;
    private String comment;

    public Comment() {
    }

    public Comment(String comment) {
        this.comment = comment;
    }

    public String getUser() { return user; }

    public void setUser(String user) { this.user = user; }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}

