/*
 * @(#) $(NAME).java    1.0     3/28/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package iuh.fit.se.ontap.librarysingleton;

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
        books = Collections.synchronizedList(new ArrayList<>());
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

    public void addBook(Book book){
        synchronized (books){
            books.add(book);
        }
    }

    public void displayBook(){
        synchronized (books){
            for (Book book : books){
                System.out.println(book);
            }
        }
    }

    public static void main(String[] args) {
        Library library = Library.getInstance();
        library.addBook(new Book("Thieu Nhi", "Tran Tan Dat"));
        Library library2 = Library.getInstance();
        library2.addBook(new Book("Tham Tu", "Conan"));
        library2.displayBook();
    }
}
