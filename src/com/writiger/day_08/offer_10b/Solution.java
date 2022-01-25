package com.writiger.day_08.offer_10b;

public class Solution {
    public int numWays(int n) {
        int ans = 1, temp = 1, sum, MOD = 1000000007;
        for (int i = 0; i < n; i++) {
            sum = (ans + temp) % MOD;
            ans = temp;
            temp = sum;
        }
        return ans;
    }
}
