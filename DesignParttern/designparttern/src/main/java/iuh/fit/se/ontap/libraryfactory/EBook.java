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
 * @created: 28-March-2025 10:03 PM
 */

public class EBook extends Book{
    private String title;
    private String author;

    public EBook(String title, String author) {
        this.title = title;
        this.author = author;
    }


    @Override
    public void getBook() {
        System.out.println("Sach dien tu: "+this.title+", "+ this.author);
    }

}
