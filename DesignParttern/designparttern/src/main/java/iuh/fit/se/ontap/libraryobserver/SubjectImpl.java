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
 * @created: 28-March-2025 11:36 PM
 */

import java.util.ArrayList;
import java.util.List;

public class SubjectImpl implements Subject{
    private List<Observer> list = new ArrayList<>();
    @Override
    public void register(Observer observer) {
        if(!list.contains(observer)){
            list.add(observer);
        }
    }

    @Override
    public void unregister(Observer observer) {
        if(list.contains(observer)){
            list.remove(observer);
        }
    }

    @Override
    public void notifyAll(String message) {
        for(Observer observer : list){
            observer.update(message);
        }
    }
}
