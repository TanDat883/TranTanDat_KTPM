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
 * @created: 28-March-2025 10:05 PM
 */

public class BookFactory {
    public static Book createBook(String type, String title, String author){
        if("E".equalsIgnoreCase(type)){
            return new EBook(title, author);
        }else if("Paper".equalsIgnoreCase(type)){
            return new PaperBook(title, author);
        }
        return null;
    }
}
