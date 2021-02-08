package models;

import models.enums.Role;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class UserTest {

    private User user = new User("userTest");
    private Author author = new Author("Jules Verne");
    private Book book = new Book("20 000 lieux sous les mers", author);

    @Test
    public void guestCantBorrowBook(){
        Assertions.assertFalse(this.user.canBorrowBook());
    }

    @Test
    public void guestBecomeMemberAfterLoggingIng(){
        this.user.login();
        Assertions.assertEquals(Role.MEMBER, this.user.getRole());
    }

    @Test
    public void memberCanBorrowBook(){
        this.user.login();
        Assertions.assertTrue(this.user.canBorrowBook());
    }

    @Test
    public void memberHasBookAfterBorrowing(){
        this.user.login();
        this.user.borrowBook(book);
        boolean result = Arrays.asList(this.user.getBooks()).contains(book);
        Assertions.assertTrue(result);
    }

    @Test
    public void guestDoesntHaveBookAfterBorrowing(){
        this.user.borrowBook(book);
        boolean result = Arrays.asList(this.user.getBooks()).contains(book);
        Assertions.assertFalse(result);
    }

}
