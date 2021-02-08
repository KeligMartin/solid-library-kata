package models;

import java.util.List;

public class Library {
    public List<Book> books;
    public List<User> users;

    public Library(List<Book> books){
        this.books = books;
    }

    public boolean bookAlreadyStocked(Book book){
        return this.books.contains(book);
    }
}
