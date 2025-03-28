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
 * @created: 28-March-2025 6:24 PM
 */

public class CanceledState implements State{

    @Override
    public void handleRequest() {
        System.out.println("Da huy");
    }
}
