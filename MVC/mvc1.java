//Create a simple Java application for managing a list of books. 
//The application should allow users to add a book to the list and display the list of books.

import java.util.ArrayList;
import java.util.List;

class BookModel {
    private List<String> books = new ArrayList<>();

    public void addBook(String book) {
        books.add(book);
    }

    public List<String> getBooks() {
        return books;
    }
}
class BookView {
    public void displayBooks(List<String> books) {
        for (String book : books) {
            System.out.println(book);
        }
    }

    public String getBookTitle() {
        System.out.print("Enter book title: ");
        return System.console().readLine();
    }
}
class BookController {
    private BookModel model;
    private BookView view;

    public BookController(BookModel model, BookView view) {
        this.model = model;
        this.view = view;
    }

    public void addBook() {
        String book = view.getBookTitle();
        model.addBook(book);
    }

    public void displayBooks() {
        view.displayBooks(model.getBooks());
    }
}
public class MVCDemo {
    public static void main(String[] args) {
        BookModel model = new BookModel();
        BookView view = new BookView();
        BookController controller = new BookController(model, view);

        controller.addBook();
        controller.displayBooks();
    }
}


