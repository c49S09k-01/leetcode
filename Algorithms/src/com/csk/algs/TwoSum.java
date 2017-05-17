package com.csk.algs;
//求一个数组 a 中任意两个元素和为 sum 的个数
//ThreeSum 的问题与此类似，时间复杂度为 N*N*logN
//时间复杂度为 N*logN;
import java.util.Arrays;

public class TwoSum {
	public static int count(int sum,int[] a){
		int N = a.length;
		int cnt = 0;
		Arrays.sort(a);   //底层实现为 归并排序，复杂度为 N * logN
		for(int i = 0;i < N;i++){
			if(BinarySearch.rank(sum - a[i], a) > i)
				cnt++;
		}
		return cnt;
	}
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6};
		System.out.println(count(7,a));
	}
}
