package iuh.fit.se.observer;/*
 * @(#) $(NAME).java    1.0     3/15/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */


/*
 * @description
 * @author: Tran Tan Dat
 * @version: 1.0
 * @created: 15-March-2025 10:14 AM
 */
public interface Subject {
    public void register(Observer obj);
    public void unregister(Observer obj);
    public void notifyObservers();
    public Object getUpdate(Observer obj);
}

    