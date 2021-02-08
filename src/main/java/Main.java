import models.Author;
import models.Book;
import models.User;

public class Main {
    public static void main(String[] args) {
        User user = new User("Kelig");
        user.login();
        Author author = new Author("Emile Zola");
        Book book = new Book("L'assomoir", author);
        System.out.println(user.borrowBook(book));
    }
}
