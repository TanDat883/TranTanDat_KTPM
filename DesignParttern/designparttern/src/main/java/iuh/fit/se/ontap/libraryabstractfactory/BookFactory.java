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
 * @created: 28-March-2025 10:24 PM
 */

public class BookFactory {
    public static Book getBook(BookAbstractFactory bookAbstractFactory){
        return bookAbstractFactory.createBook();
    }
}
