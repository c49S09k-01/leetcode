package com.csk.leetcode.hashtable;

/**
 * Created by 24866 on 2017/5/14.
 *
 * Count the number of prime numbers less than a non-negative number, n.
 */
public class CountPrimes {
    public static void main(String[] args) {
        System.out.println(new CountPrimes().countPrimes_(11)); // 2,3,5,7
    }
    public int countPrimes(int n) {
        boolean[] notPrime = new boolean[n];
        int count = 0;
        for (int i = 2; i < n; i++)
            if (notPrime[i] == false) {
                count++;
                for (int j = 2; i*j < n; j++)
                    notPrime[i*j] = true;
            }
        return count;
    }

    //精髓的一批啊 给跪了
    // 11   2,3,5,7
    public int countPrimes_(int n) {
        if (n < 3) return 0;
        boolean[] f = new boolean[n];
        int count = n / 2;  //偶数都不是质数，但是 2 是质数，1不是质数，剩下的总数是 n / 2
                            //然后减去不是质数的个数，剩下的就是质数的个数。
        //下面的循环中不会出现偶数
        for (int i = 3; i * i < n; i += 2) {
            if (f[i]) continue; // 如果 i 不是素数，则 i * i，i + 2 * i 都不是素数,所以直接 continue.
            for (int j = i * i; j < n; j += 2 * i) {
                if (!f[j]) {
                    --count;
                    f[j] = true;  // 不是素数的都设为 true;
                }
            }
        }
        return count;
    }

    //判断一个数是不是素数
    private boolean isPrime(int num) {
        if (num <= 1) return false;
        // Loop's ending condition is i * i <= num instead of i <= sqrt(num)
        // to avoid repeatedly calling an expensive function sqrt().
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
