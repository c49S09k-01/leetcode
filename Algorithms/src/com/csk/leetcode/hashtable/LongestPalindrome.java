package com.csk.leetcode.hashtable;

import java.util.HashSet;
import java.util.Hashtable;

/**
 * Created by 24866 on 2017/5/11.
 *
 * Given a string which consists of lowercase or uppercase letters, find the length of the longest palindromes that can be built with those letters.

 This is case sensitive, for example "Aa" is not considered a palindrome here.

 Input:
 "abccccdd"

 Output:
 7

 Explanation:
 One longest palindrome that can be built is "dccaccd", whose length is 7.
 */
public class LongestPalindrome {
    public static void main(String[] args) {
        System.out.println(new LongestPalindrome().longestPalindrome("abccccdd"));
    }

    //AC
    public int longestPalindrome(String s) {
        int length = 0;
        boolean b = false;
        Hashtable<Character,Integer> hashtable = new Hashtable<>();
        for(int i = 0;i < s.length();i++)
            hashtable.put(s.charAt(i),hashtable.getOrDefault(s.charAt(i),0) + 1);
        for(Integer i : hashtable.values())
            if(i > 1){
                length += i / 2 * 2;
                if(i % 2 == 1)
                    b = true;
            }
            else b = true;
        return b ? ++length : length;
    }

    //别人的 很精髓
    public int longestPalindrome_(String s) {
        if(s == null || s.length() == 0) return 0;
        HashSet<Character> hs = new HashSet<Character>();
        int count = 0;
        for(int i=0; i<s.length(); i++){
            if(hs.contains(s.charAt(i))){
                hs.remove(s.charAt(i));
                count++;
            }else{
                hs.add(s.charAt(i));
            }
        }
        if(!hs.isEmpty()) return count*2+1;
        return count*2;
    }
}
