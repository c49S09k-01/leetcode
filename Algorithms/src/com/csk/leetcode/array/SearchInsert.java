package com.csk.leetcode.array;

/*
Difficulty: Easy
Contributor: LeetCode
Given a sorted array and a target value, return the index if the target is found. 
If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.

Here are few examples.
[1,3,5,6], 5 → 2
[1,3,5,6], 2 → 1
[1,3,5,6], 7 → 4
[1,3,5,6], 0 → 0
 */
public class SearchInsert {
	public static void main(String[] args) {
		int[] nums = {1,3,5,6};
		System.out.println(new SearchInsert().searchInsert(nums, 0));
	}

	public int searchInsert(int[] nums, int target) {
		int high = nums.length - 1;
		int low = 0;
		int mid = 0;
		while(low <= high){
			mid = low + (high - low) / 2;
			if(target < nums[mid])
				high = mid - 1;
			else if(target > nums[mid])
				low = mid + 1;
			else return mid;
		}
		if(target < nums[mid])
			return mid;
		else return mid + 1;
	}
}
