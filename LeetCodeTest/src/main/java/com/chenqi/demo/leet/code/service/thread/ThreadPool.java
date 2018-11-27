package com.chenqi.demo.leet.code.service.thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author chenqi6
 */
public class ThreadPool {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        MyPool myPool = new MyPool();
        for (int i = 0; i < 5; i++) {
            executorService.submit(myPool);
        }
        executorService.shutdown();
    }

}

class MyPool implements Runnable{
    @Override
    public void run() {
        for(int i = 0 ;i<10;i++){
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}