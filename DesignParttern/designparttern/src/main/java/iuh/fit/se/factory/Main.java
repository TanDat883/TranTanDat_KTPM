/*
 * @(#) $(NAME).java    1.0     3/28/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package iuh.fit.se.factory;

/*
 * @description
 * @author: Tran Tan Dat
 * @version: 1.0
 * @created: 28-March-2025 5:30 PM
 */

public class Main {
    public static void main(String[] args) {
        Book paperBook = BookFactory.getBook("giay", "Dat", "Ja");
        Book eBook = BookFactory.getBook("dientu", "Son", "HaHa");
        System.out.println(paperBook);
        System.out.println((eBook));
    }
}
