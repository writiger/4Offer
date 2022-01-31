package com.writiger.day_13.offer_58a;

public class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        int right = s.length() - 1, left = right;
        StringBuilder res = new StringBuilder();
        while(left >= 0){
            while(left >= 0 && s.charAt(left) != ' ') left--;
            res.append(s.substring(left + 1, right + 1)).append(" ");
            while(left >= 0 && s.charAt(left) == ' ') left--;
            right = left;
        }
        return res.toString().trim();
    }
}
