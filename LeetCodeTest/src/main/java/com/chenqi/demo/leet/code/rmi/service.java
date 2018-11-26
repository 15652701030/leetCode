package com.chenqi.demo.leet.code.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 陈琪
 * @Date: 2018/11/26 22:58
 * To change this template use File | Settings | File Templates.
 */
public class Service {
    public static void main(String[] args) {
        try {
            HelloService helloService = new HelloService();
            LocateRegistry.createRegistry(1099);
            Naming.rebind("rmi://127.0.0.1/Hello", helloService);
            System.out.println("服务启动成功");
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }
}
