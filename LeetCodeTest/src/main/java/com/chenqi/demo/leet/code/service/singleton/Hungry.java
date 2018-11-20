package com.chenqi.demo.leet.code.service.singleton;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 陈琪
 * @Date: 2018/11/13 22:54
 * To change this template use File | Settings | File Templates.
 */
public class Hungry {
    private Hungry() {};

    public static final Hungry hungry = new Hungry();

    public static Hungry getInstance(){
        return hungry;
    }
}
