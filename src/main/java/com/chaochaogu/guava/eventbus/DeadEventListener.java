package com.chaochaogu.guava.eventbus;

import com.google.common.eventbus.DeadEvent;
import com.google.common.eventbus.Subscribe;

/**
 * @author 马秀成
 * @date 2019/8/22
 * @jdk.version 1.8
 * @desc 如果EventBus发送的消息都不是订阅者关心的称之为Dead Event
 */

public class DeadEventListener {

    boolean isDelivered=true;

    @Subscribe
    public void listen(DeadEvent event){
        isDelivered=false;
        System.out.println(event.getSource().getClass()+"  "+event.getEvent()); //source通常是EventBus
    }

    public boolean isDelivered() {
        return isDelivered;
    }

}
