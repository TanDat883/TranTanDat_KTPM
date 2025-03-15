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
 * @created: 15-March-2025 10:21 AM
 */

public class Main {
    public static void main(String[] args) {
        MyTopic topic = new MyTopic();

        Observer obj1 = new MyTopicSubscriber("Obj1");
        Observer obj2 = new MyTopicSubscriber("Obj2");
        Observer obj3 = new MyTopicSubscriber("Obj3");

        topic.register(obj1);
        topic.register(obj2);
        topic.register(obj3);

        obj1.setSubject(topic);
        obj2.setSubject(topic);
        obj3.setSubject(topic);

        obj1.update();

        topic.postMessage("New Message");
        topic.unregister(obj1);
        topic.postMessage("New Message");
    }
}
