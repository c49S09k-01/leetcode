package com.csk.leetcode.hashtable;

import java.util.HashMap;

/**
 * Created by 24866 on 2017/5/12.
 * <p>
 * Given two strings s and t, write a function to determine if t is an anagram of s.
 * <p>
 * For example,
 * s = "anagram", t = "nagaram", return true.
 * s = "rat", t = "car", return false.
 */
public class IsAnagram {
    public static void main(String[] args) {
        System.out.println(new IsAnagram().isAnagram_("anagram", "nagaram"));
    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++)
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        for (int i = 0; i < t.length(); i++) {
            if (map.get(t.charAt(i)) == null)
                return false;
            if (map.get(t.charAt(i)) == 1)
                map.remove(t.charAt(i));
            else map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
        }
        if (map.size() == 0)
            return true;
        return false;
    }

    //和我想法一致，但是处理方法比我好很多，比较精髓
    public boolean isAnagram_(String s, String t) {
        int[] alphabet = new int[26];
        for (int i = 0; i < s.length(); i++) alphabet[s.charAt(i) - 'a']++;
        for (int i = 0; i < t.length(); i++) alphabet[t.charAt(i) - 'a']--;
        for (int i : alphabet) if (i != 0) return false;
        return true;
    }
}
