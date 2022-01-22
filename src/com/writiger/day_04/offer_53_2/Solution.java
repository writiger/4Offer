package com.writiger.day_04.offer_53_2;

public class Solution {
    public int missingNumber(int[] nums) {
        int left = 0, right = nums.length - 1;

        while(left <= right){
            int mid = (left + right) / 2;
            if(nums[mid] == mid)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return left;
    }
}
