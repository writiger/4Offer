package com.writiger.day_16.offer_45;

public class Solution {
    public String minNumber(int[] nums) {
        String[] str = new String[nums.length];
        for(int i = 0; i < nums.length; i++)
            str[i] = String.valueOf(nums[i]);
        quickSort(str,0,str.length - 1);
        StringBuilder res = new StringBuilder();
        for(String s : str)
            res.append(s);
        return res.toString();
    }

    void quickSort(String[] strings, int l, int r) {
        if(l >= r) return;
        int i = l, j = r;
        String temp = strings[i];
        while(i < j) {
            while((strings[j] + strings[l]).compareTo(strings[l] + strings[j]) >= 0 && i < j) j--;
            while((strings[i] + strings[l]).compareTo(strings[l] + strings[j]) <= 0 && i < j) i++;
            temp = strings[i];
            strings[i] = strings[j];
            strings[j] = temp;
        }
        strings[i] = strings[l];
        strings[l] = temp;
        quickSort(strings, l, i - 1);
        quickSort(strings, j + 1, r);
    }
}
