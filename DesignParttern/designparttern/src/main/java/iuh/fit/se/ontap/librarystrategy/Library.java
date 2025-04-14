/*
 * @(#) $(NAME).java    1.0     3/28/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package iuh.fit.se.ontap.librarystrategy;

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
    private SearchStrategy searchStrategy;

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


    public void addBook(Book book){
        books.add(book);
    }

    public void setSearchStrategy(SearchStrategy searchStrategy) {
        this.searchStrategy = searchStrategy;
    }

    public List<Book> searchBook(String keyword){
        if(searchStrategy == null ){
            throw  new RuntimeException();
        }
        return searchStrategy.seach(books, keyword);
    }

    public static void main(String[] args) {
        Library library = Library.getInstance();
        library.addBook(new Book("a", "v", "c"));
        Library library2 = Library.getInstance();
        library2.addBook(new Book("sach", "v", "c"));
        library2.setSearchStrategy(new SearchByTen());
        List<Book> result = library2.searchBook("sach");

    }

}
