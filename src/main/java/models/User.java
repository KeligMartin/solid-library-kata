package models;

import models.enums.Role;
import models.interfaces.UserInterface;

public class User implements UserInterface {

    private String username;
    private Role role;
    private Book[] books = new Book[3];

    public User(String username){
        this.username = username;
        this.role = Role.GUEST;
    }

    public void login(){
        this.role = Role.MEMBER;
    }

    public boolean canBorrowBook() {
        return this.role == Role.MEMBER;
    }

    public Book borrowBook(Book book){
        if(canBorrowBook()){
            books[0] = book;
            return book;
        }
        return null;
    }

    public Book[] getBooks() {
        return books;
    }

    public String getUsername(){
        return this.username;
    }
}
