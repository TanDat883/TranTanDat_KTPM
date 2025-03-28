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
 * @created: 28-March-2025 5:21 PM
 */

public class PaperBook extends Book {

    private String author;
    private String title;

    public PaperBook(String author, String title) {
        this.author = author;
        this.title = title;
    }

    @Override
    public String getAuthor() {
        return this.author;
    }

    @Override
    public String getTitle() {
        return this.title;
    }
}
