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
 * @created: 08-March-2025 11:19 AM
 */
/*
    StaticBlockSingleton là một cách triển khai Eager Initialization Singleton,
    nhưng với một lợi thế: cho phép xử lý ngoại lệ khi khởi tạo instance.
 */
public class StaticBlockSingleton {
    private static StaticBlockSingleton instance;
    private StaticBlockSingleton(){}
    //static block initialization for exception handling
    static{
        try{
            instance = new StaticBlockSingleton();
        }catch(Exception e){
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }
    public static StaticBlockSingleton getInstance(){
        return instance;
    }
}
