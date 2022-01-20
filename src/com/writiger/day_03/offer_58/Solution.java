package com.writiger.day_03.offer_58;

public class Solution {
    public String reverseLeftWords(String s, int n){

        String leftStr = new String(s.toCharArray(),0,n);
        String rightStr = new String(s.toCharArray(),n,s.length()-n);

        return rightStr+leftStr;
    }
}