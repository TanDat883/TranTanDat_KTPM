/*
 * @(#) $(NAME).java    1.0     3/28/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package iuh.fit.se.decorator;

/*
 * @description
 * @author: Tran Tan Dat
 * @version: 1.0
 * @created: 28-March-2025 7:05 PM
 */

public class BasicProduct implements Product{
    private double basePrice;
    private String name;

    public BasicProduct(double basePrice, String name) {
        this.basePrice = basePrice;
        this.name = name;
    }

    @Override
    public double getPrice() {
        return basePrice;
    }

    @Override
    public String getDescription() {
        return name;
    }
}
