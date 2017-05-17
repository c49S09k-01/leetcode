package com.csk.leetcode.array;
//精髓,也很严谨
//在一堆数据里面找一个数据 用 hashmap 好点 0（1）    折半查找不够快
import java.util.HashMap;
import java.util.Map;

/**
 * Created by 24866 on 2017/5/9.
 *
 * Given an array of integers and an integer k, you need to find the number of unique k-diff pairs in the array.
 * Here a k-diff pair is defined as an integer pair (i, j), where i and j are both numbers in the array and their
 * absolute difference is k.
 *
 * Input: [3, 1, 4, 1, 5], k = 2
 Output: 2
 Explanation: There are two 2-diff pairs in the array, (1, 3) and (3, 5).
 Although we have two 1s in the input, we should only return the number of unique pairs.

 Input: [1, 3, 1, 5, 4], k = 0
 Output: 1
 Explanation: There is one 0-diff pair in the array, (1, 1).
 */
public class FindPairs {
    public static void main(String[] args) {
        int[] nums = {3,1,4,1,5};
        System.out.println(new FindPairs().findPairs(nums,2));

    }
    public int findPairs(int[] nums, int k) {
//        第一步 三个要点
        if (nums == null || nums.length == 0 || k < 0)   return 0;
//          第二步 getOrDefault 是亮点
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
//        第三步 if else 亮点  else 里面的也是亮点
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (k == 0) {
                //count how many elements in the array that appear more than twice.
                if (entry.getValue() >= 2) {
                    count++;
                }
            } else {
                if (map.containsKey(entry.getKey() + k)) {
                    count++;
                }
            }
        }
        return count;
    }
}
