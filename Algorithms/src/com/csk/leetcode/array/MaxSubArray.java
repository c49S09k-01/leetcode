package com.csk.leetcode.array;

/*
 * Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
the contiguous subarray [4,-1,2,1] has the largest sum = 6.
 */
public class MaxSubArray {
	public static void main(String[] args) {
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		// 			  -2 1 -2 4  3 5 6 -1 4
		System.out.println(new MaxSubArray().maxSubArray(nums));
	}

	public int maxSubArray(int[] nums) {
		int n = nums.length;
		int[] dp = new int[n];//dp[i] means the maximum subarray ending with A[i];
		dp[0] = nums[0];
		int max = dp[0];

		for(int i = 1; i < n; i++){
			dp[i] = nums[i] + (dp[i - 1] > 0 ? dp[i - 1] : 0);
			//System.out.println(dp[i]);
			max = Math.max(max, dp[i]);
		}

		return max;
	}
}
