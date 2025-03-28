/*
 * @(#) $(NAME).java    1.0     3/28/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package iuh.fit.se.singleton.library;

/*
 * @description
 * @author: Tran Tan Dat
 * @version: 1.0
 * @created: 28-March-2025 4:32 PM
 */

import java.util.ArrayList;
import java.util.List;

public class Library {
   private static volatile Library instance;
   private List<String> books;

   private Library(){
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

   public void addBook(String book){
       books.add(book);
       System.out.println("add book suscess");
   }

   public void displayBook(){
       for (String book : books){
           System.out.println(book);
       }
   }

//    public static void main(String[] args) {
//        Library library1 = Library.getInstance();
//        library1.addBook("Hoat hinh");
//        Library library2 = Library.getInstance();
//        library2.addBook("Tham tu");
//        library2.displayBook();
//    }
}

