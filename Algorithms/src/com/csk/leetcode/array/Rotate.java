package com.csk.leetcode.array;

/*
 * Rotate an array of n elements to the right by k steps.

For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
 */
public class Rotate {
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6,7};
		new Rotate().rotate(nums, 3);
		for (int i : nums)
			System.out.print(i + "   ");
	}

	public void rotate(int[] nums, int k) {
		k %= nums.length;
		reverse(nums, 0, nums.length - 1);
		reverse(nums, 0, k - 1);
		reverse(nums, k, nums.length - 1);
	}
	
	void reverse(int[] nums,int start,int end){
		while(start < end){
			int temp = nums[start];
			nums[start++] = nums[end];
			nums[end--] = temp;
		}
	}

}
