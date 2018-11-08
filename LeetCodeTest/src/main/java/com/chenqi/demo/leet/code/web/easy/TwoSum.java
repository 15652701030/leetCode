package com.chenqi.demo.leet.code.web.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 陈琪
 * @Date: 2018/11/8 21:46
 * 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
 * 你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 */
public class TwoSum {

    private static int[] twoSum(int[] nums, int target) {
        for (int i =  0; i< nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]+nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException("no two sum");
    }

    private static int[] twoSum2(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0 ; i<nums.length; i++){
            map.put(nums[i],i);
        }
        for (int i = 0; i< nums.length;i++){
            int com = target - nums[i];
            if (map.containsKey(com) && map.get(com) != i) {
                return new int[]{i,map.get(com)};
            }
        }
        throw new IllegalArgumentException("no two sum");
    }

    private static int[] twoSum3(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i< nums.length; i++){
            int com = target - nums[i];
            if(map.containsKey(com)){
                return new int[]{map.get(com), i};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("no two sum");
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2,4,6,8};
        int target = 14;
        int[] result = twoSum2(nums, target);
        System.out.print(result);
    }



}
