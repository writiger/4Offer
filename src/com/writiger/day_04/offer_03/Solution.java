package com.writiger.day_04.offer_03;

public class Solution {
    static public int findRepeatNumber(int[] nums){
        int ans = -1;
        int size = nums.length;
        int[] arr = new int[size];

        for (int temp : nums) {
            arr[temp]++;
            if(arr[temp] == 2)
            {
                ans = temp;
                break;
            }
        }

        return ans;
    }
}
