package models;

import models.enums.Role;
import models.interfaces.LibrarianInterface;

public class Librarian implements LibrarianInterface {

    String name;
    Role role = Role.LIBRARIAN;

    public Librarian(String name){
        this.name = name;
    }

    @Override
    public void addBook(Library library, Book book) {
        if (library.bookAlreadyStocked(book)) {
            System.out.println("Book already in this library !");
        }
        else {
            library.books.add(book);
        }
    }

}
