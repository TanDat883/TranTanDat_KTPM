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
 * @created: 08-March-2025 10:55 AM
 */

/**
 * Singleton là một design pattern thuộc nhóm Creational Pattern,
 * được sử dụng để đảm bảo rằng chỉ có một instance duy nhất của một class
 * tồn tại trong suốt vòng đời của ứng dụng.
 */
public class TestSingleton {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Thread1());
        Thread thread2 = new Thread(new Thread2());
        Thread thread3 = new Thread(new Thread3());

        thread1.start();
        thread2.start();
        thread3.start();
    }

    static class Thread1 implements Runnable {
        @Override
        public void run() {
//          ThreadSafeSingleton singleton = ThreadSafeSingleton.getInstance("11111");
//            System.out.println(singleton.hashCode()+ " " + singleton.value);

//            EagerInitializedSingleton singleton = EagerInitializedSingleton.getInstance();
//            System.out.println(singleton.hashCode());

//            StaticBlockSingleton singleton = StaticBlockSingleton.getInstance();
//            System.out.println(singleton.hashCode());

//            LazyInitializedSingleton singleton = LazyInitializedSingleton.getInstance();
//            System.out.println(singleton.hashCode());

            BillPughSingleton singleton = BillPughSingleton.getInstance();
            System.out.println(singleton.hashCode());
        }
    }

    static class Thread2 implements Runnable {
        @Override
        public void run() {
//            ThreadSafeSingleton singleton = ThreadSafeSingleton.getInstance("22222");
//            System.out.println(singleton.hashCode()+ " " + singleton.value);

//            EagerInitializedSingleton singleton = EagerInitializedSingleton.getInstance();
//            System.out.println(singleton.hashCode());

//            StaticBlockSingleton singleton = StaticBlockSingleton.getInstance();
//            System.out.println(singleton.hashCode());

//            LazyInitializedSingleton singleton = LazyInitializedSingleton.getInstance();
//            System.out.println(singleton.hashCode());

            BillPughSingleton singleton = BillPughSingleton.getInstance();
            System.out.println(singleton.hashCode());
        }
    }

    static class Thread3 implements Runnable {
        @Override
        public void run() {
//            ThreadSafeSingleton singleton = ThreadSafeSingleton.getInstance("33333");
//            System.out.println(singleton.hashCode()+ " " + singleton.value);

//            EagerInitializedSingleton singleton = EagerInitializedSingleton.getInstance();
//            System.out.println(singleton.hashCode());

//            StaticBlockSingleton singleton = StaticBlockSingleton.getInstance();
//            System.out.println(singleton.hashCode());

//            LazyInitializedSingleton singleton = LazyInitializedSingleton.getInstance();
//            System.out.println(singleton.hashCode());

            BillPughSingleton singleton = BillPughSingleton.getInstance();
            System.out.println(singleton.hashCode());
        }
    }
}
