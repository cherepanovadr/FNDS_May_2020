package Articles20;

public class Article {
    private String title;
    private String content;
    private String author;

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return String.format("%s - %s: %s",this.title,this.content,this.author);
    }

    public String getContent() {
        return content;
    }

    public String getAuthor() {
        return author;
    }

    public Article(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }
}
