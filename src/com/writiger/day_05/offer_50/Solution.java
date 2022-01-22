package com.writiger.day_05.offer_50;

import java.util.HashMap;

public class Solution {
    public char firstUniqChar(String s) {
        HashMap<Character, Boolean> dic = new HashMap<>();
        char[] arrStr = s.toCharArray();
        for(char c : arrStr)
            dic.put(c, !dic.containsKey(c));
        for(char c : arrStr)
            if(dic.get(c)) return c;

        return ' ';
    }
}
