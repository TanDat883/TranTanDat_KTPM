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
 * @created: 08-March-2025 10:51 AM
 */

/*
    EagerInitializedSingleton được sử dụng khi một ứng dụng cần một đối tượng duy nhất trong suốt vòng đời
    và muốn đảm bảo rằng đối tượng này được tạo sẵn ngay khi chương trình khởi động.
 */
public class EagerInitializedSingleton {
    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();
    // Private constructor to avoid client applications to use constructor
    private EagerInitializedSingleton() {}

    public static EagerInitializedSingleton getInstance() {
        return instance;
    }
}
