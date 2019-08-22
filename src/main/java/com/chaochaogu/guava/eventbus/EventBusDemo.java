package com.chaochaogu.guava.eventbus;

import com.google.common.eventbus.EventBus;

/**
 * @author 马秀成
 * @date 2019/8/22
 * @jdk.version 1.8
 * @desc
 */

public class EventBusDemo {
    public static void main(String[] args) {
        EventBus eventBus=new EventBus("jack");
       /*
         如果多个subscriber订阅了同一个事件,那么每个subscriber都将收到事件通知
         并且收到事件通知的顺序跟注册的顺序保持一致
        */
        eventBus.register(new EventListener()); //注册订阅者
        eventBus.register(new MultiEventListener());
        eventBus.register(new DeadEventListener());
        eventBus.post(new OrderEvent("hello")); //发布事件
        eventBus.post(new OrderEvent("world"));
        eventBus.post("!");
    }
}
