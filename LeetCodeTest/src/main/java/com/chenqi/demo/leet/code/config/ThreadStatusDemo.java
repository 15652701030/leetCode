package com.chenqi.demo.leet.code.config;

import java.util.concurrent.TimeUnit;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 陈琪
 * @Date: 2018/11/20 22:33
 * To change this template use File | Settings | File Templates.
 */
public class ThreadStatusDemo {

    public static void main(String[] args) {
        new Thread(()->{
            while (true){
                try {
                    TimeUnit.SECONDS.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"timed_waiting").start();
    }

}
