package com.chaochaogu.guava.eventbus;

import com.google.common.eventbus.Subscribe;

/**
 * @author 马秀成
 * @date 2019/8/22
 * @jdk.version 1.8
 * @desc
 */

public class MultiEventListener {

    @Subscribe
    public void listen(OrderEvent event){
        System.out.println("receive msg: "+event.getMessage());
    }

    @Subscribe
    public void listen(String message){
        System.out.println("receive msg: "+message);
    }
}