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
 * @created: 08-March-2025 10:52 AM
 */
/*
     ThreadSafeSingleton được sử dụng khi một ứng dụng chạy đa luồng
     và cần đảm bảo chỉ có một instance duy nhất được tạo ra,
     tránh tình trạng tạo nhiều instance không mong muốn.
 */
public class ThreadSafeSingleton {
    private static volatile ThreadSafeSingleton instance;

    public String value;

    private ThreadSafeSingleton(String value){
        this.value = value;
    }

    public static ThreadSafeSingleton getInstance(String value) {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton(value);
                }
            }
        }
        return instance;
    }
}

