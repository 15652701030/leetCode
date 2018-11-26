package com.chenqi.demo.leet.code.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 陈琪
 * @Date: 2018/11/26 23:00
 * To change this template use File | Settings | File Templates.
 */
public class Client {
    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {
        HelloService hello = (HelloService) Naming.lookup("rmi://127.0.0.1/Hello");
        System.out.println(hello.message("chenqi"));
    }
}
