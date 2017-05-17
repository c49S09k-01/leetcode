package com.csk.leetcode.array;

//Java neat and easy understand solution, O(n) time, O(1) space
// 和我想法一致，使用类似于 c++ 里面的指针，三个指针分别指向最大，第二大，第三大的数字，但是代码比我的整齐简洁
// 没有大量的 if else，值得学习.

/**
 * Created by 24866 on 2017/5/9.
 *
 * Given a non-empty array of integers, return the third maximum number in this array. If it does not exist,
 * return the maximum number. The time complexity must be in O(n).
 *
 *
 */
public class ThirdMax {
    public static void main(String[] args) {
        int[] nums = {2,2,3,1};
        System.out.println(new ThirdMax().thirdMax(nums));
    }
    public int thirdMax(int[] nums) {
        Integer max1 = null;
        Integer max2 = null;
        Integer max3 = null;
        for (Integer n : nums) {
            //第一步
            if (n.equals(max1) || n.equals(max2) || n.equals(max3)) continue;
            //第二步 || 处理的很细节，此处不能用 |, 不然会报错
            if (max1 == null || n > max1) {
                max3 = max2;
                max2 = max1;
                max1 = n;
            } else if (max2 == null || n > max2) {
                max3 = max2;
                max2 = n;
            } else if (max3 == null || n > max3) {
                max3 = n;
            }
        }
        return max3 == null ? max1 : max3;
    }
}
