package com.csk.leetcode.array;

/*
 * Given a binary array (二进制数组，即数组元素非 0 即 1), find the maximum number of consecutive 1s in this array.
 * Input: [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s.
    The maximum number of consecutive 1s is 3.
 */
public class FindMaxConsecutiveOnes {
	public static void main(String[] args) {
		int[] nums = {1,1,0,1,1,1};
		System.out.println(new FindMaxConsecutiveOnes().findMaxConsecutiveOnes(nums));
	}

	public int findMaxConsecutiveOnes(int[] nums) {
		int max = 0, a = 0;
		for (int i : nums) {        //遍历数组的正确方式
			if (i == 1)
				a++;
			else {
				max = Math.max(a, max);
				a = 0;
			}

		}
		return Math.max(max, a);
	}
}
