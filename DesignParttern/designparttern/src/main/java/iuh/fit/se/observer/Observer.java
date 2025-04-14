/*
 * @(#) $(NAME).java    1.0     3/15/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package iuh.fit.se.observer;


/*
 * @description
 * @author: Tran Tan Dat
 * @version: 1.0
 * @created: 15-March-2025 10:15 AM
 */
public interface Observer {
    public void update();
    public void setSubject(Subject sub);
}

