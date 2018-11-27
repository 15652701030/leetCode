package com.chenqi.demo.leet.code.service.thread;

/**
 * @author chenqi6
 */
public class RunnableTest {
    public static void main(String[] args) {
        Thread.currentThread().setName("main thread");
        Thread thread = new Thread(new MyRunable());
        thread.setName("子线程：");
        thread.start();
        for(int i = 0; i < 5; i ++){
            System.out.println(Thread.currentThread().getName() + i);
        }

    }
}

class MyRunable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + i);
        }
    }
}
