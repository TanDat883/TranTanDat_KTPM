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
 * @created: 15-March-2025 10:20 AM
 */

public class MyTopicSubscriber implements Observer{
    private String name;
    private Subject topic;

    public MyTopicSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        String msg = (String) topic.getUpdate(this);
        if(msg == null){
            System.out.println(name+":: No new message");
        }else{
            System.out.println(name+":: Consuming message::"+msg);
        }
    }

    @Override
    public void setSubject(Subject sub) {
        this.topic=sub;
    }
}
