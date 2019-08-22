package com.chaochaogu.guava.futurecallback;

import com.google.common.util.concurrent.*;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author 马秀成
 * @date 2019/8/21
 * @jdk.version 1.8
 * @desc 让异步回调更加简单
 */
public class GuavaFutureCallback {

    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(3);
        ListeningExecutorService listeningExecutorService = MoreExecutors.listeningDecorator(es);
        ListenableFuture listenableFuture = listeningExecutorService.submit(new Callable<Integer>() {

            public Integer call() throws Exception {
                if(new Random().nextInt(3) == 2){
                    throw new NullPointerException();
                }
                return 1;
            }
        });
        FutureCallback futureCallback = new FutureCallback() {

            public void onSuccess(Object o) {
                System.out.println("-----" + o);
            }

            public void onFailure(Throwable throwable) {
                System.out.println("=====" + throwable.getMessage());
            }
        };

        Futures.addCallback(listenableFuture ,futureCallback ,es);
    }

}
