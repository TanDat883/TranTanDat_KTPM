/*
 * @(#) $(NAME).java    1.0     3/28/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package iuh.fit.se.ontap.libraryobserver;

/*
 * @description
 * @author: Tran Tan Dat
 * @version: 1.0
 * @created: 28-March-2025 11:39 PM
 */

import java.util.ArrayList;
import java.util.List;

public class Library extends SubjectImpl{
    private static Library instance;
    private List<String> books;
    private Library(){
        books = new ArrayList<>();
    }

    public static Library getInstance() {
        if (instance == null) {
            synchronized (Library.class) {
                if (instance == null) {
                    instance = new Library();
                }
            }
        }
        return instance;
    }
    public void addBook(String title){
        books.add(title);
        notifyAll("Da them sach moi");
    }

    public void BookExpiry(String title){
        notifyAll("Sach " + title + " da het han");
    }
}
