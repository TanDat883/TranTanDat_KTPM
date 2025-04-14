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
 * @created: 28-March-2025 10:46 PM
 */

import java.util.List;

public class SearchByTen implements SearchStrategy{
    @Override
    public List<Book> seach(List<Book> books, String keyword) {
        for (Book book: books){
            if(book.getTen().contains(keyword)){
                System.out.println(book);
            }
        }
        return null;
    }
}
