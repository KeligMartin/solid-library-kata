package models.service;

import models.Book;
import models.Library;

import java.io.*;
import java.util.Scanner;

public class FileService {

   public static void initiateLibrary(Library library) {
       try {
           File file = getFile("src/main/resources/books.txt");
           Scanner myReader = new Scanner(file);
           insertBooks(myReader, library);
           myReader.close();
       } catch (FileNotFoundException e) {
           e.printStackTrace();
       }
   }

   public static void readAuthorFile(Library library){
       try {
           File file = getFile("src/main/resources/books.txt");
           Scanner myReader = new Scanner(file);
           while (myReader.hasNextLine()){
               String data = myReader.nextLine();
               System.out.println(data);
           }
           myReader.close();
           library.books.forEach(System.out::println);
       } catch (FileNotFoundException e) {
           e.printStackTrace();
       }
   }

    private static File getFile(String path) {
        return new File(path);
    }

    private static void insertBooks(Scanner myReader, Library library) {
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            Book book = new Book(data, null);
            library.books.add(book);
        }
    }

    public static void writeFile(){
       try {
           FileWriter myWriter = new FileWriter("src/main/resources/users.txt");
           PrintWriter printWriter = new PrintWriter(myWriter);
           printWriter.print("test");
           printWriter.close();
       } catch (IOException e){
           e.printStackTrace();
       }
   }
}
