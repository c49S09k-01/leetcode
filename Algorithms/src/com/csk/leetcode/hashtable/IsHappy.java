package com.csk.leetcode.hashtable;

//https://my.oschina.net/Tsybius2014/blog/524681  关于快乐数算法的一篇博客

/**
 * Created by 24866 on 2017/5/14.
 *
 * Write an algorithm to determine if a number is "happy".

 A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits,
 and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
 Those numbers for which this process ends in 1 are happy numbers.

 Example: 19 is a happy number

 12 + 92 = 82
 82 + 22 = 68
 62 + 82 = 100
 12 + 02 + 02 = 1
 */

/**
1、如果一个数“不快乐”，则它计算到后面必然陷入到这个循环里：4, 16, 37, 58, 89, 145, 42, 20, 4, ...

2、对于一个大于243的数字来说，它的下一个数字一定比它小。这是因为一个大于1000的数字，它的下一个数字一定比它小，而对于1000以下最大的数字999，它的下一个数字是243，
所以1000以下数字的下一个数字也只可能小于或等于243
 */

public class IsHappy {
/**
 * 在十进位下，100以内的快乐数有（OEIS中的数列A00770） ：1, 7, 10, 13, 19, 23, 28, 31, 32, 44, 49, 68, 70, 79, 82, 86, 91, 94, 97, 100。
 */

    //最精辟的方法
    public boolean isHappy(int n) {
        int next;
        //不快乐数必然会产生结果为 4 ，所以循环可以退出
            while(n>6){
                next = 0;
                while(n != 0){
                    next+=(n%10)*(n%10);
                    n/=10;
                }
                n = next;
            }
            return n==1;
        }

    public boolean isHappy_(int n){
        int temp = n;
        while (true) {
            temp = getNext(temp);
            if (temp > 145) {
                continue;
            } else if (temp == 4 || temp == 16 || temp == 37 || temp == 58 ||
                    temp == 89 || temp == 145 || temp == 42 || temp == 20) {
                return false;
            } else if (temp == 1) {
                return true;
            }
        }
    }

    /**
     * 获取下一个快乐的数
     * @param num
     * @return
     */
    private int getNext(int num) {
        int result = 0;
        while (num > 0) {
            result += (num % 10) * (num % 10);
            num = num / 10;
        }
        return result;
    }
}
