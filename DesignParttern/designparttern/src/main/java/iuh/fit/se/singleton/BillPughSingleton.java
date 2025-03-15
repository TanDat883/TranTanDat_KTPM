/*
 * @(#) $(NAME).java    1.0     3/8/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package iuh.fit.se.singleton;

/*
 * @description
 * @author: Tran Tan Dat
 * @version: 1.0
 * @created: 08-March-2025 11:25 AM
 */

/*
    Thread-safe mà không cần synchronized (hiệu suất cao).
    Chỉ khởi tạo instance khi cần thiết (Lazy Initialization).
    Sử dụng Inner Static Helper Class, đảm bảo chỉ có một instance duy nhất mà không cần khóa
 */
public class BillPughSingleton {
    private BillPughSingleton() {
    }

    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
