package com.chenqi.demo.leet.code.web.easy;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 陈琪
 * @Date: 2018/11/8 22:39
 * To change this template use File | Settings | File Templates.
 */
public class SortArrayByParity {
    public static int[] sortArrayByParity(int[] num) {
        int len = num.length;
        int i =0;
        int j = len-1;
        int tem = num[0];
        while (i < j){
            while ((i<j) && num[j]%2 != 0){
                j--;
            }
            num[i] = num[j];
            while ((i<j) && num[i]%2 ==0){
                i++;
            }
            num[j] = num[i];
        }
        num[i] = tem;
        return num;
    }

    public static void main(String[] args) {
        int[] result = sortArrayByParity(new int[]{3,1,2,4,5,11});
        System.out.print(result);
    }
}
