package com.csk.leetcode.array;

/*
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n,
 *  find the one that is missing from the array.
For example,
Given nums = [0, 1, 3] return 2
 */
public class MissingNumber {
	public static void main(String[] args) {
		int[] nums = {1};
		//System.out.println(2^0);
		System.out.println(new MissingNumber().missingNumber(nums));
	}

	 // a^b^b =a
	//00
	//10
	//10  , a^0=a
	public int missingNumber(int[] nums) {
		int xor = 0, i = 0;
		for (i = 0; i < nums.length; i++) {
			xor = xor ^ i ^ nums[i];
		}

		return xor ^ i;
	}
}
