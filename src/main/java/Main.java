import models.Library;
import models.User;
import models.Book;
import models.Author;
import models.Librarian;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User user = new User("Kelig");
        List<Book> books = new ArrayList<>();
        Library library = new Library(books);
        Librarian librarian = new Librarian("Rui");
        user.login();
        Author author = new Author("Emile Zola");
        Book book = new Book("L'assomoir", author);
        Book book2 = new Book("L'oeuvre", author);
        librarian.addBook(library, book);
        librarian.addBook(library, book);
        System.out.println(library.books);
        user.borrowBook(book);
    }
}
