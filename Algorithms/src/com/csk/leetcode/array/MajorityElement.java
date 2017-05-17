package com.csk.leetcode.array;

import java.util.Arrays;

/*
 * Given an array of size n, find the majority element. 
 * The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.

 */
public class MajorityElement {
	public static void main(String[] args) {
		int[] nums = {};
		System.out.println(new MajorityElement().majorityElement(nums));
	}
	
	//我自己的方法 
	public int majorityElement(int[] nums) {
		Arrays.sort(nums);
		return nums[nums.length / 2];
	}
	
	//别人的方法 O(n) Time O(1) Space
	public int majorityElement1(int[] nums){
		int major = nums[0],count = 1;
		for(int i = 1;i < nums.length;i++){
			if(count == 0){
				major = nums[i];
				count++;
			}
			else if(nums[i] == major)
						count++;
				 else count--;
		}
		return major;
	}
}
