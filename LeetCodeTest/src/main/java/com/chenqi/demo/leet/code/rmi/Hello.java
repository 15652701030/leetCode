package com.chenqi.demo.leet.code.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 陈琪
 * @Date: 2018/11/26 22:56
 * To change this template use File | Settings | File Templates.
 */
public interface Hello extends Remote {

    String message(String msg) throws RemoteException;
}
