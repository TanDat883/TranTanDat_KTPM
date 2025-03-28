/*
 * @(#) $(NAME).java    1.0     3/28/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package iuh.fit.se.strategy;

/*
 * @description
 * @author: Tran Tan Dat
 * @version: 1.0
 * @created: 28-March-2025 6:41 PM
 */

public class Item {
    private String upCode;
    private double price;

    public Item(String upCode, double price) {
        this.upCode = upCode;
        this.price = price;
    }

    public String getUpCode() {
        return upCode;
    }

    public double getPrice() {
        return price;
    }
}
