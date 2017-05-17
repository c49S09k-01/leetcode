package com.csk.leetcode.hashtable;

import java.util.*;

/**
 * Created by 24866 on 2017/5/12.
 *
 * Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].
 */
public class Intersect {

    //一次 AC 哈哈哈 和别人想法一致
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : nums1)
            map.put(i,map.getOrDefault(i,0) + 1);
        for(int i : nums2){
            // 优化的地方 如果值等于 1 的话不必要 remove
            if(map.containsKey(i) && map.get(i) > 0){
                map.put(i,map.get(i) - 1);
                list.add(i);
            }
        }
        int j = 0;
        int[] arrs = new int[list.size()];
        for(int i : list)
            arrs[j++] = i;
        return arrs;
    }

        //想法特别好
        public int[] intersect_(int[] nums1, int[] nums2) {
            Arrays.sort(nums1);
            Arrays.sort(nums2);
            int la = nums1.length, lb = nums2.length;
            List<Integer> list = new ArrayList<Integer>();
            for(int i = 0, j = 0; i < la && j < lb;) {
                if(nums1[i] == nums2[j]) {
                    list.add(nums1[i]);
                    i++;
                    j++;
                } else if(nums1[i] < nums2[j]) {
                    i++;
                } else {
                    j++;
                }
            }

            int[] res = new int[list.size()];
            for(int i = 0; i < list.size(); i++) {
                res[i] = list.get(i);
            }

            return res;
        }
}
