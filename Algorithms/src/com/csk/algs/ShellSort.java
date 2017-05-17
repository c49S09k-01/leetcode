package com.csk.algs;
import static com.csk.algs.Example.*;
public class ShellSort {
	// 希尔排序,将 a[] 按升序排列
	//它的运行时间达不到平方级别
	public static void shellSort(Comparable[] a){
		int N = a.length;
		int h = 1;
		while(h < N / 3)
			h = 3 * h + 1;  // 1,4,13,40,121,364,1093,...
		while(h >= 1){
			for(int i = h;i < N;i++){
				//将 a[i] 插入到 a[i - h],a[i - 2 * h],a[i - 3 * h]... 之中
				for(int j = i;j >= h && less(a[j],a[j - h]);j -= h)
					exch(a, i, j - h);
			}
			h = h / 3;
		}
	}
}
