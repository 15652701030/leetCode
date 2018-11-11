package com.chenqi.demo.leet.code.web.easy;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 陈琪
 * @Date: 2018/11/8 23:29
 * To change this template use File | Settings | File Templates.
 */
public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int index = 1;
        for (int i = 1; i <nums.length;i++) {
            if(nums[i] != nums[i-1]){
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        removeDuplicates(new int[]{1,2,2,2});
    }
}
