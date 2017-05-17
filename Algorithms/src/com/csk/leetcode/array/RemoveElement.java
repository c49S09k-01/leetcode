package com.csk.leetcode.array;

/*
 * Given an array and a value, remove all instances of that value in place and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.

Example:
Given input array nums = [3,2,2,3], val = 3

Your function should return length = 2, with the first two elements of nums being 2.
 */
public class RemoveElement {
	public static void main(String[] args) {
		int[] nums = {3,2,2,3};
		int length = new RemoveElement().removeElement(nums, 3);
		for(int i = 0;i < length;i++)
			System.out.print(nums[i] + "\t");
	}

	public int removeElement(int[] nums, int val) {
		int length = 0;
		for(int i : nums){
			if(i != val)
				nums[length++] = i;
		}
		return length;
	}
}
