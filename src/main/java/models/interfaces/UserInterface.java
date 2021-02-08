package models.interfaces;

import models.Book;

public interface UserInterface {
    boolean canBorrowBook();
    void login();
    void borrowBook(Book book);
    void insertBook(Book book);
}
