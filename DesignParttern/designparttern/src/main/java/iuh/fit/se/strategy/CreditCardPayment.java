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
 * @created: 28-March-2025 6:36 PM
 */

public class CreditCardPayment implements PaymentStrategy{
    private String name;
    private String cartNumber;
    private String cvv;

    public CreditCardPayment(String name, String cartNumber, String cvv) {
        this.name = name;
        this.cartNumber = cartNumber;
        this.cvv = cvv;
    }

    @Override
    public void payment(double amount) {
        System.out.println("Paid " + amount + " With CreditCardPayment ");
    }
}
