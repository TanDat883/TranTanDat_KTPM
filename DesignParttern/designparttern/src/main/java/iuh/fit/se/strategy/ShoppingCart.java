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
 * @created: 28-March-2025 6:42 PM
 */

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Item> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    public void removeItem(Item item){
        this.items.remove(item);
    }

    public double calculateTotal(){
        double sum = 0;
        for (Item item : items){
            sum += item.getPrice();
        }
        return sum;
    }

    public void pay(PaymentStrategy paymentStrategy){
        double amout = calculateTotal();
        paymentStrategy.payment(amout);
    }
}
