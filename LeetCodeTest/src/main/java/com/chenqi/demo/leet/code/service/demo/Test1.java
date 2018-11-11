package com.chenqi.demo.leet.code.service.demo;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 陈琪
 * @Date: 2018/11/9 22:53
 * To change this template use File | Settings | File Templates.
 */
public class Test1 {

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj == null){
            return false;
        }
        if (getClass() != obj.getClass()){
            return false;
        }
        Test1 other = (Test1) obj;
        if (id != other.id) {
            return false;
        }
        return true;
    }
}
