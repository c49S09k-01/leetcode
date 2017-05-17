package com.csk.leetcode.hashtable;

import java.util.HashSet;

/**
 * Created by 24866 on 2017/5/11.
 *
 * Given two arrays, write a function to compute their intersection.

 Example:
 Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].
 */
public class Intersection {
    public static void main(String[] args) {

    }
    public int[] intersection(int[] nums1, int[] nums2) {
        // hashset 无序不重复
        HashSet<Integer> set1 = new HashSet();
        HashSet<Integer> set2 = new HashSet();
        for(int i : nums1)
            set1.add(i);
        for(int i: nums2)
            if(set1.contains(i))
                set2.add(i);
        int[] arrs = new int[set2.size()];
        int i = 0;
        for(int a : set2)
            arrs[i++] = a;
        return arrs;
    }
}
