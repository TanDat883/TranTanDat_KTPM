/*
 * @(#) $(NAME).java    1.0     3/28/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package iuh.fit.se.ontap.libraryfactory;

/*
 * @description
 * @author: Tran Tan Dat
 * @version: 1.0
 * @created: 28-March-2025 9:35 PM
 */


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Library {
    private static Library instance;
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public static Library getInstance(){
        if(instance == null){
            synchronized (Library.class){
                if(instance == null){
                    instance = new Library();
                }
            }
        }
        return instance;
    }

    public void addBook(String type, String title, String author){
        Book book = BookFactory.createBook(type,title,author);
        books.add(book);
    }

    public void displayBook(){
            for (Book book : books){
                book.getBook();
        }
    }

    public static void main(String[] args) {
        Library library = Library.getInstance();
        library.addBook("E", "Conan", "Tan Dat");
        Library library2 = Library.getInstance();
        library2.addBook("Paper", "Naruto", "Gsuban");
        library2.displayBook();
    }
}
