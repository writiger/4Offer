package com.writiger.day_09.offer_42;

public class Solution {
    public int maxSubArray(int[] nums){
        int pre = 0, maxAns = nums[0];
        for (int i : nums){
            pre = Math.max(pre + i, i);
            maxAns = Math.max(pre,maxAns);
        }
        return maxAns;
    }
}
