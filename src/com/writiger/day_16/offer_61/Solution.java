package com.writiger.day_16.offer_61;

import java.util.Arrays;

public class Solution {
    public boolean isStraight(int[] nums) {
        Arrays.sort(nums);
        int min = 0;
        for (int i = 0; i < 5; i++) {
            if (i < 4 && nums[i] == nums[i + 1] && nums[i] != 0)
                return false;
            if (min == 0)
                min = nums[i];
        }
        return nums[4] - min < 5;
    }
}
