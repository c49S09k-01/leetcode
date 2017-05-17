package com.csk.leetcode.hashtable;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by 24866 on 2017/5/15.
 *
 * Given a List of words, return the words that can be typed using letters of alphabet on only one row's of American keyboard like the image below.
 *
 * Example 1:
 Input: ["Hello", "Alaska", "Dad", "Peace"]
 Output: ["Alaska", "Dad"]
 */
public class FindWords {
    public static void main(String[] args) {
        for(String s : new FindWords().findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"}))
            System.out.println(s);
    }

    //请收下我的膝盖
    public String[] findWords(String[] words) {
        //[xyz]	字符集合。匹配所包含的任意一个字符。例如， '[abc]' 可以匹配 "plain" 中的 'a'。
        //*	匹配前面的子表达式零次或多次。例如，zo* 能匹配 "z" 以及 "zoo"。* 等价于{0,}。
        return Stream.of(words).filter(s -> s.toLowerCase().matches("[qwertyuiop]*|[asdfghjkl]*|[zxcvbnm]*")).toArray(String[]::new);
    }


    //也不失为一个好办法
    public String[] findWords_(String[] words) {
        String row1 = "QWERTYUIOP", row2 = "ASDFGHJKL", row3 = "ZXCVBNM";

        List<String> list = new LinkedList<>();
        int index = 0; boolean r1, r2, r3;
        for (String word : words) {
            r1 = r2 = r3 = true;
            for (index = 0; index < word.length(); index++) {
                if (r1 && row1.indexOf(word.toUpperCase().charAt(index)) < 0) r1 = false;
                if (r2 && row2.indexOf(word.toUpperCase().charAt(index)) < 0) r2 = false;
                if (r3 && row3.indexOf(word.toUpperCase().charAt(index)) < 0) r3 = false;
                if (!r1 && !r2 && !r3) break;
            }
            if (index == word.length()) list.add(word);
        }
        return list.toArray(new String[0]);
    }
}
