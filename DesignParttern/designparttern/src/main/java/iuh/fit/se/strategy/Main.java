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
 * @created: 28-March-2025 6:46 PM
 */

public class Main {
    public static void main(String[] args) {
        ShoppingCart shop = new ShoppingCart();
        Item item = new Item("A", 50.6);
        Item item2 = new Item("B", 20.6);
        shop.addItem(item);
        shop.addItem(item2);
        shop.pay(new PayPalPayment("dat@gmail.com","123"));
        shop.pay(new CreditCardPayment("dat", "12345","15/28"));
    }
}
