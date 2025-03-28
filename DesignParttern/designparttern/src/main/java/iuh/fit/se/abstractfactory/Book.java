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
 * @created: 28-March-2025 5:20 PM
 */

public abstract class Book {
    public abstract String getAuthor();
    public abstract String getTitle();

    @Override
    public String toString() {
        return "author:" + this.getAuthor() + ",title:" + this.getTitle();
    }
}
