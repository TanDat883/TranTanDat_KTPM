/*
 * @(#) $(NAME).java    1.0     3/28/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package iuh.fit.se.abstractfactory;

/*
 * @description
 * @author: Tran Tan Dat
 * @version: 1.0
 * @created: 28-March-2025 5:55 PM
 */

public class Main {
    public static void main(String[] args) {
        Book eBook = BookFactory.getBook(new EbookFactory("Dat","oooo"));
        Book paperBook = BookFactory.getBook(new PaperBookFactory("DAT", "LLLL"));
        System.out.println(eBook);
        System.out.println(paperBook);
    }
}
