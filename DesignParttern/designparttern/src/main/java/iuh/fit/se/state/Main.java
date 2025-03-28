/*
 * @(#) $(NAME).java    1.0     3/28/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package iuh.fit.se.state;

/*
 * @description
 * @author: Tran Tan Dat
 * @version: 1.0
 * @created: 28-March-2025 6:26 PM
 */

public class Main {
    public static void main(String[] args) {
        DocumentContext context = new DocumentContext();
        System.out.println("🔥 Bắt đầu xử lý đơn hàng:");
        context.setState(new NewOrderState());
        context.applyState();
        context.setState(new ProcessingState());
        context.applyState();
        context.setState(new DeliveredState());
        context.applyState();
        System.out.println("\n🚨 Đơn hàng bị hủy:");
        context.setState(new CanceledState());
        context.applyState();
    }
}
