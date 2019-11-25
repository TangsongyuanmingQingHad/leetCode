package com.had.Leetcode.TwoSum01;

import java.util.HashMap;

/**
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
 * <p>
 * 示例：
 * <p>
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
       if(nums == null || nums.length < 2) {
           return new int[] {-1,-1};
       } 

       int res[] = new int[] {-1,-1};
       HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
       for(int i=0;i<nums.length;i++) {
           if(map.containsKey(target - nums[i])) {
               res[0] = map.get(target - nums[i]);
               res[1] = i;
               break;
           }
           map.put(nums[i], i);
       }
       return res;
    }
}

