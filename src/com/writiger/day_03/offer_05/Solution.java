package com.writiger.day_03.offer_05;

public class Solution {
    static public String replaceSpace(String s) {
        int length = s.length();
        char[] arr =  new char[length * 3];
        int size = 0;
        for(int i = 0; i < length; i ++){
            char c = s.charAt(i);
            if(c == ' '){
                arr[size] = '%';
                arr[++size] = '2';
                arr[++size] = '0';
            }else{
                arr[size] = c;
            }
            size++;
        }
        return new String(arr, 0, size);
    }
}
