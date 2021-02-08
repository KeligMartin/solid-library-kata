package models;

import models.enums.Role;
import models.interfaces.UserInterface;
import java.util.Arrays;

public class User implements UserInterface {

    private String username;
    private Role role;
    private Book[] books = new Book[3];

    public User(String username){
        this.username = username;
        this.role = Role.GUEST;
    }

    public void login(){
        if(this.role == Role.GUEST){
            this.role = Role.MEMBER;
        }
    }

    public boolean canBorrowBook() {
        return this.role == Role.MEMBER;
    }

    public void borrowBook(Book book){
        if(canBorrowBook()){
            insertBook(book);
        }
    }

    public void insertBook(Book book){
        for(int i = 0; i < books.length; i++){
            if(books[i] == null){
                books[i] = book;
                break;
            }
        }
    }

    public Book[] getBooks() {
        return books;
    }

    public Role getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", role=" + role +
                ", books=" + Arrays.toString(books) +
                '}';
    }
}
