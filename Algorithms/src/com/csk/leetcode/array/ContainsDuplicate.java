package com.csk.leetcode.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
 * Given an array of integers, find if the array contains any duplicates. 
 * Your function should return true if any value appears at least twice in the array, 
 * and it should return false if every element is distinct.
 */
public class ContainsDuplicate {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 0, 2 };
		System.out.println(new ContainsDuplicate().containsDuplicate(nums));
	}

	// 一种思路
	public boolean containsDuplicate(int[] nums) {
		Set<Integer> set = new HashSet<>(); // Set 无序不重复.
		for (int i : nums) {
			if (set.contains(i))
				return true;
			set.add(i);
		}
		return false;
	}

	// 第二种思路
	public boolean containsDuplicate1(int[] nums) {
		Arrays.sort(nums);
		for (int ind = 1; ind < nums.length; ind++) {
			if (nums[ind] == nums[ind - 1]) {
				return true;
			}
		}
		return false;
	}
}
