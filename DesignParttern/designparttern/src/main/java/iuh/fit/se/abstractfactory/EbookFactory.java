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
 * @created: 28-March-2025 5:48 PM
 */

public class EbookFactory implements BookAbstractFactory{
    private String author;
    private String title;

    public EbookFactory(String author, String title) {
        this.author = author;
        this.title = title;
    }

    @Override
    public Book createBook() {
        return new EBook(author, title);
    }

}
