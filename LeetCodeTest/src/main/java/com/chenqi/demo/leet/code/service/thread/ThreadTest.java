package com.chenqi.demo.leet.code.service.thread;

/**
 * @author chenqi6
 */
public class ThreadTest {

    public static void main(String[] args) {
        Thread.currentThread().setName("main thread:");
        MyThread thread = new MyThread();
        thread.setName("子线程：");
        thread.start();
        for (int i = 0; i < 5; i ++){
            System.out.println(Thread.currentThread().getName() + i);
        }
    }

}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <0; i++) {
            System.out.println(Thread.currentThread().getName()+ i);
        }
    }
}