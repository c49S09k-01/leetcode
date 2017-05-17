package com.csk.algs;
import static com.csk.algs.Example.*;

//插入排序，对部分有序的或者非随机的数组特别有效
public class Insertion {
	public static void sort(Comparable[] a){
		int N = a.length;
		for(int i = 1;i < N;i++){
			for(int j = i;j > 0 && less(a[j],a[j - 1]);j--){
				exch(a, j, j - 1);
			}
		}
	}
}
