/*
 * @(#) $(NAME).java    1.0     3/28/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package iuh.fit.se.ontap.libraryobserver;


/*
 * @description
 * @author: Tran Tan Dat
 * @version: 1.0
 * @created: 28-March-2025 11:34 PM
 */
public interface Subject {
    void register(Observer observer);
    void unregister(Observer observer);
    void notifyAll(String message);
}

    