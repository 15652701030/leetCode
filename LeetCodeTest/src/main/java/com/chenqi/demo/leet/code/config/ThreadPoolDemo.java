package com.chenqi.demo.leet.code.config;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 陈琪
 * @Date: 2018/11/24 17:02
 * To change this template use File | Settings | File Templates.
 */
public class ThreadPoolDemo implements  Runnable{

    static ExecutorService executorService = Executors.newFixedThreadPool(3);


    @Override
    public void run() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        for (int i = 0 ; i < 10; i++) {
            executorService.execute(new ThreadPoolDemo());
        }
        executorService.shutdown();
    }
}
