import java.util.ArrayList;
import java.util.List;

public class BookCataloging {
    private List<Book> books;

    public BookCataloging(){
        books = new  ArrayList<>();
    }
//   *************** ADD BOOK************
    public void addBook(Book book){
        books.add(book);
    }

//   *************** DISPLAY BOOKS************
    public void displayBooks(){
        System.out.println("Books in the Store");
        for (Book book:books){
            System.out.println("Title "+ book.getTitle() + "Author " +book.getAuthor() );
        }
    }

//   *************** DELETE BOOK************
    public void deleteBooks(String title) {
        for (Book book:books){
            if(book.getTitle().equals(title)){
                books.remove(book);
                System.out.println("Book removed " + book.getTitle());
            }
        }
        System.out.println("Book not found: "+ title);
    }
}
