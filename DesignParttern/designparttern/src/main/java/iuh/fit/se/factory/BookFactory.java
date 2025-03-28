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
 * @created: 28-March-2025 5:27 PM
 */

public class BookFactory {
    public static Book getBook(String type, String author, String title){
        if("Giay".equalsIgnoreCase(type)) {
            return new PaperBook(author, title);
        }else if("DienTu".equalsIgnoreCase(type)){
            return new EBook(author, title);
        }
        return null;
    }
}
