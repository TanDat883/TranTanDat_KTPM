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
 * @created: 28-March-2025 7:15 PM
 */

public class Main {
    public static void main(String[] args) {
        Product basicProduct = new BasicProduct(10000, "Laptop");
        System.out.println("Basic Product: " + basicProduct.getDescription());
        System.out.println("Price: " + basicProduct.getPrice());

        Product productWithConsumptionTax = new ConsumptionTaxDecorator(basicProduct);
        System.out.println("\nWith Consumption Tax: " + productWithConsumptionTax.getDescription());
        System.out.println("Price: " + productWithConsumptionTax.getPrice());

        Product productWithVAT = new VATDecorator(basicProduct);
        System.out.println("\nWith VAT: " + productWithVAT.getDescription());
        System.out.println("Price: " + productWithVAT.getPrice());

        Product luxuryProduct = new LuxuryTaxDecorator(new VATDecorator(basicProduct));
        System.out.println("\nWith VAT and Luxury Tax: " + luxuryProduct.getDescription());
        System.out.println("Price: " + luxuryProduct.getPrice());
    }
}
