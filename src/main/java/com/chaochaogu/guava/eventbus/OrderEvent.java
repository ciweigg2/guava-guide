package com.chaochaogu.guava.eventbus;

/**
 * @author 马秀成
 * @date 2019/8/22
 * @jdk.version 1.8
 * @desc Guava 发布-订阅模式中传递的事件,是一个普通的POJO类
 */
public class OrderEvent {  //事件
    private String message;

    public OrderEvent(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
