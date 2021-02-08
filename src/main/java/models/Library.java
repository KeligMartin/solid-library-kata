package models;

import java.util.List;

public class Library {
    List<Book> books;

    public boolean bookAlreadyStocked(Book book){
        return this.books.contains(book);
    }
}
