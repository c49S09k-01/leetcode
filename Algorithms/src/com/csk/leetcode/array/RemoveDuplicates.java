package com.csk.leetcode.array;

/*
 * Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

For example,
Given input array nums = [1,1,2],

Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the new length.
 */
public class RemoveDuplicates {
	public static void main(String[] args) {
		int[] nums = {1,1,2,3};
		int length = new RemoveDuplicates().removeDuplicates(nums);
		System.out.println("length : " + length);
		for(int i = 0;i < length;i++)
			System.out.print(nums[i] + "\t");
	}
	public int removeDuplicates(int[] nums) {
		if(nums.length < 2)
			return nums.length;
		int length = 1;
		for(int i  = 1;i < nums.length;i++){
			if(nums[i] != nums[i - 1])
				nums[length++] = nums[i];
		}
		return length;
	}
}
