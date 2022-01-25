package com.writiger.day_08.offer_63;

public class Solution {
   public int maxProfit(int[] prices){
       if(prices.length < 2) return 0;
       int ans = 0;
       int minTemp = prices[0];
       for(int i = 1; i < prices.length; i++){
           if(prices[i] < minTemp)
               minTemp = prices[i];
           if(prices[i] - minTemp > ans)
               ans = prices[i] - minTemp;
       }
       return ans;
   }

}
