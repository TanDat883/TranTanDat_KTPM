package iuh.fit.se.singleton.library;/*
 * @(#) $(NAME).java    1.0     3/28/2025
 * 
 * Copyright (c) 2025 IUH. All rights reserved.
 */
 

/*
 * @description
 * @author: Tran Tan Dat
 * @version: 1.0
 * @created: 28-March-2025 4:56 PM     
 */

import iuh.fit.se.singleton.TestSingleton;
import iuh.fit.se.singleton.library.Library;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Thread1());
        Thread thread2= new Thread(new Thread2());
        Thread thread3 = new Thread(new Thread3());

        thread1.start();
        thread2.start();
        thread3.start();
    }

    static class Thread1 implements Runnable{

        @Override
        public void run() {
            Library library = Library.getInstance();
            library.addBook("Hoat Hinh");
            library.displayBook();
        }
    }
    static class Thread2 implements Runnable{

        @Override
        public void run() {
            Library library = Library.getInstance();
            library.addBook("Tham tu");
            library.displayBook();
        }
    }
    static class Thread3 implements Runnable{

        @Override
        public void run() {
            Library library = Library.getInstance();
            library.addBook("Tre em");
            library.displayBook();
        }
    }
}
