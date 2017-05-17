package com.csk.leetcode.array;

/*
 * Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.

Example 1:
Input: [7, 1, 5, 3, 6, 4]
Output: 5

max. difference = 6-1 = 5 (not 7-1 = 6, as selling price needs to be larger than buying price)

Example 2:
Input: [7, 6, 4, 3, 1]
Output: 0

In this case, no transaction is done, i.e. max profit = 0.
 */
public class MaxProfit {
	public static void main(String[] args) {
		int[] prices = { 7, 1, 5, 3, 6, 4 };
//		int[] prices = {7, 6, 4, 3, 1};
		System.out.println(new MaxProfit().maxProfit_(prices));
	}
	// 我自己写的 
	public int maxProfit(int[] prices) {
		if(prices.length == 0)
			return 0;
		int maxPro = 0;
		int mix = prices[0];
		for(int i : prices){
			maxPro = (maxPro > i - mix) ? maxPro : (i - mix);
			mix = (mix < i) ? mix : i;
		}
		return maxPro;
	}
	
	//别人的
	public int maxProfit_(int[] prices) {
        int maxCur = 0, maxSoFar = 0;
        for(int i = 1; i < prices.length; i++) {
// (6 - 3) + (3 - 5) + (5 - 1) = (6 - 1)
            maxCur = Math.max(0, maxCur += prices[i] - prices[i-1]);  // 0 4 2 5 3
            maxSoFar = Math.max(maxCur, maxSoFar); 					  // 0 4 4 5 5
        }
        return maxSoFar;
    }
}

