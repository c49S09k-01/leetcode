package com.csk.leetcode.array;

/**
 * Created by 24866 on 2017/5/9.
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * <p>
 * For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].
 */
public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        new MoveZeroes().moveZeroes(nums);
        for (int i : nums) {
            System.out.print(i + "  ");
        }
    }

    public void moveZeroes(int[] nums) {
        int count = 0;
        for (int i : nums)
            if (i != 0) nums[count++] = i;
        for (int i = count; i < nums.length; i++)
            nums[i] = 0;
    }
}