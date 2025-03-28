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
 * @created: 28-March-2025 7:14 PM
 */

public class LuxuryTaxDecorator extends TaxDecorator{
    public LuxuryTaxDecorator(Product product) {
        super(product);
    }

    @Override
    public double getPrice() {
        double basePrice = product.getPrice();
        return basePrice + (basePrice + 0.20);
    }

    @Override
    public String getDescription() {
        return product.getDescription() + ", with Luxury Tax (20%)";
    }
}
