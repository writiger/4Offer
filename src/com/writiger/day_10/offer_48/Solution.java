package com.writiger.day_10.offer_48;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> dic = new HashMap<>();
        int res = 0, temp = 0;
        for(int j = 0; j < s.length(); j++) {
            int i = dic.getOrDefault(s.charAt(j), -1);
            dic.put(s.charAt(j), j);
            temp = temp < j - i ? temp + 1 : j - i;
            res = Math.max(res, temp);
        }
        return res;
    }
}
