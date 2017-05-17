package com.csk.leetcode.hashtable;

/**
 * Created by 24866 on 2017/5/14.
 *
 * Given an array of integers, every element appears twice except for one. Find that single one.
 */
public class SingleNumber {

    //using XOR(想同为 0 ，不同为 1)
    public int singleNumber(int[] nums) {
        int num = 0;
        for(int i: nums)
            num ^= i;
        return num;
    }
}
