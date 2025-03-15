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
 * @created: 08-March-2025 11:22 AM
 */
/*
    LazyInitializedSingleton là một cách triển khai Singleton theo cơ chế khởi tạo chậm (Lazy Initialization),
    tức là instance chỉ được tạo khi cần thiết thay vì tạo ngay khi class được load.
    Không an toàn trong môi trường đa luồng (có thể có nhiều thread cùng tạo instance)
 */
public class LazyInitializedSingleton {
    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton() {
    }

    public static LazyInitializedSingleton getInstance() {
        if (instance == null) {
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
}
