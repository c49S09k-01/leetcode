package com.csk.leetcode.hashtable;

/**
 * Created by 24866 on 2017/5/14.
 *
 * Given two strings s and t, determine if they are isomorphic(同构).

 Two strings are isomorphic if the characters in s can be replaced to get t.

 All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

 For example,
 Given "egg", "add", return true.

 Given "foo", "bar", return false.

 Given "paper", "title", return true.

 You may assume both s and t have the same length.
 */


/*
可以尝试着用 LinkedHashMap 解决，保存了 put 进 map 的顺序
 */
public class IsIsomorphic {
    public static void main(String[] args) {
        System.out.println(new IsIsomorphic().isIsomorphic("",""));
    }
    public boolean isIsomorphic(String s, String t) {
        int m1[] = new int[256], m2[] = new int[256], n = s.length();
        for (int i = 0; i < n; ++i) {
            if (m1[s.charAt(i)] != m2[t.charAt(i)]) return false;
                m1[s.charAt(i)] = i + 1;
                m2[t.charAt(i)] = i + 1;
        }
        return true;
    }
}
