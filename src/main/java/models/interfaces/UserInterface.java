package models.interfaces;

import models.Book;

public interface UserInterface {
    boolean canBorrowBook();
    void login();
    Book borrowBook(Book book);
}
