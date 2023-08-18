import java.io.StringReader;

public class Books {

    private String title;
    private String author;

    Books(String title, String author){
        this.title=title;
        this.author=author;
    }

    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
}
