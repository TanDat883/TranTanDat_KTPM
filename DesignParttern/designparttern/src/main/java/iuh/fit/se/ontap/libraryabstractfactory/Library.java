/*
 * @(#) $(NAME).java    1.0     3/28/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package iuh.fit.se.ontap.libraryabstractfactory;

/*
 * @description
 * @author: Tran Tan Dat
 * @version: 1.0
 * @created: 28-March-2025 9:35 PM
 */



import java.util.ArrayList;
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

    public Book addBook(String type, String title, String author){
        Book book = null;
        if("e".equalsIgnoreCase(type)){
              book = BookFactory.getBook(new EBookFactory(title, author));
        }else if ("p".equalsIgnoreCase(type)){
              book = BookFactory.getBook((new PaperBookFactory(title, author)));
        }
        books.add(book);
        return book;
    }

    public void display(){
        for (Book book : books){
            book.getBook();
        }
    }

    public static void main(String[] args) {
        Library library = Library.getInstance();
        library.addBook("p", "Dat", "datttt");
        Library library2 = Library.getInstance();
        library2.addBook("e", "Datttttt", "Tran");
        library2.display();
    }
}
