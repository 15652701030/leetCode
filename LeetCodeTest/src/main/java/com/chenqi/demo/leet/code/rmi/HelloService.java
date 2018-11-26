package com.chenqi.demo.leet.code.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 陈琪
 * @Date: 2018/11/26 22:57
 * To change this template use File | Settings | File Templates.
 */
public class HelloService extends UnicastRemoteObject implements Hello {
    protected HelloService() throws RemoteException {
        super();
    }

    @Override
    public String message(String msg) throws RemoteException {
        return "hello,"+msg;
    }
}
