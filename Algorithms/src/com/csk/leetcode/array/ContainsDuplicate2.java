package com.csk.leetcode.array;

import java.util.HashSet;
import java.util.Set;

/*
 * Given an array of integers and an integer k, find out whether there are two distinct indices i 
 * and j in the array such that nums[i] = nums[j] and the absolute difference between i and j is 
 * at most k.
 */
public class ContainsDuplicate2 {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 1 };
		System.out.println(new ContainsDuplicate2().containsNearbyDuplicate(nums, 5));
	}

	// 一种思路,时间复杂度过高 		N * K
	public boolean containsNearbyDuplicate(int[] nums, int k) {
		for (int i = 0; i < nums.length - 1; i++)
			for (int j = i + 1; j < i + k + 1 && j < nums.length; j++)
				if (nums[i] == nums[j])
					return true;
		return false;
	}

	// 第二种思路,优化了第二个循环的内容 		时间复杂度   N
	public boolean containsNearbyDuplicate1(int[] nums, int k) {
		Set<Integer> set = new HashSet<>(k + 1);
		for(int i = 0;i < nums.length;i++){
			if(i > k) set.remove(nums[i - k - 1]);
			if(!set.add(nums[i])) return true;
		}
		return false;
	}

}
