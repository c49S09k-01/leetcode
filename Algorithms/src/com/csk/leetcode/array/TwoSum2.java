package com.csk.leetcode.array;

/**
 * Created by csk on 2017/4/27.
 *
 * Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.

 The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.

 You may assume that each input would have exactly one solution and you may not use the same element twice.

 Input: numbers={2, 7, 11, 15}, target=9
 Output: index1=1, index2=2
 */
public class TwoSum2 {
    public static void main(String[] args) {
        int[] twoSum = {2,7,11,15};
        for(int i : new TwoSum2().twoSum(twoSum,9))
            System.out.print(i + "  ");
    }
    public int[] twoSum(int[] numbers, int target) {
        int[] arrs = new int[2];
        int low = 0;
        int high = numbers.length - 1;
        int half = numbers[low] + numbers[high];
        while(half != target){
            if(half < target) low++;
            else high--;
            half = numbers[low] + numbers[high];
        }
        arrs[0] = low + 1;
        arrs[1] = high + 1;
        return arrs;
    }
}
