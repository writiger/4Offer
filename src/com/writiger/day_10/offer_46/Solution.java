package com.writiger.day_10.offer_46;

public class Solution {
    public int translateNum(int num) {
        String s = String.valueOf(num);
        int a = 1, b = 1;
        for(int i = 2; i <= s.length(); i++){
            String temp = s.substring(i - 2, i);
            int c = temp.compareTo("10") >= 0 && temp.compareTo("25") <= 0 ? a + b : a;
            b = a;
            a = c;
        }
        return a;
    }
}
