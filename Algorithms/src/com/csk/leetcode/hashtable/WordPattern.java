package com.csk.leetcode.hashtable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * Created by 24866 on 2017/5/12.
 *
 * Given a pattern and a string str, find if str follows the same pattern.

 Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

 Examples:
 pattern = "abba", str = "dog cat cat dog" should return true.
 pattern = "abba", str = "dog cat cat fish" should return false.
 pattern = "aaaa", str = "dog cat cat dog" should return false.
 pattern = "abba", str = "dog dog dog dog" should return false.
 */
public class WordPattern {
    public static void main(String[] args) {
//        if(new WordPattern().test() == "csk")
//            System.out.println(123);
//        String s1 = new String("csk");
//        String s2 = new String("csk");
//        System.out.println(s1 == s2);
//        System.out.println(new WordPattern().wordPattern("abba","dog dog dog dog"));
    }

    public String test(){
        return "csk";
    }
    public boolean wordPattern(String pattern, String str) {
        String s;
        String[] strs = str.split("\\s+");
        if(pattern.length() != strs.length)
            return false;
        HashMap<Character,String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        for(int i = 0;i < pattern.length();i++){
            s = map.get(pattern.charAt(i));
            if(s == null){
                if(set.contains(strs[i]))
                    return false;
                set.add(strs[i]);
                map.put(pattern.charAt(i),strs[i]);
            }
            else
            //此处要用 ! equals ，不能用 !=
            if(!s.equals(strs[i])){
                    return false;
            }
        }
        return true;
    }

    //精髓啊
    public boolean wordPattern_(String pattern, String str) {
        String[] words = str.split(" ");
        if (words.length != pattern.length())
            return false;
        Map index = new HashMap();
        for (Integer i=0; i<words.length; ++i)
            if (index.put(pattern.charAt(i), i) != index.put(words[i], i))
                return false;
        return true;
    }
}
