package com.chenqi.demo.leet.code.config;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 陈琪
 * @Date: 2018/11/24 15:01
 * To change this template use File | Settings | File Templates.
 */
public class RWLockDemo {
    static Map<String, Object> map = new HashMap<>();
    static ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    static Lock read = readWriteLock.readLock();
    static Lock write = readWriteLock.writeLock();

    public static final Object set(String key, Object value){
        write.lock();
        try {
            return map.put(key, value);
        } finally {
            write.unlock();
        }

    }

}
