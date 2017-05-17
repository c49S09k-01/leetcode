package com.csk.algs;

import static com.csk.algs.Example.*;

//自底向上的归并排序
public class Merge_SortBT {
	private static Comparable[] aux;

	public static void sort(Comparable[] a) {
		int N = a.length;
		aux = new Comparable[N];
		for(int sz = 1;sz < N;sz = sz + sz){   //sz 子数组大小
			for(int lo = 0;lo < N - sz;lo += sz + sz){ // lo : 子数组索引
				merge(a,lo,lo + sz - 1,Math.min(lo + sz + sz - 1, N - 1));
			}
		}
	}


	public static void merge(Comparable[] a, int lo, int mid, int hi) {
		int i = lo, j = mid + 1;
		for (int k = lo; k <= hi; k++)
			aux[k] = a[k];
		for (int k = lo; k <= hi; k++) {
			if (i > mid)
				a[k] = aux[j++];
			else if (j > hi)
				a[k] = aux[i++];
			else if (less(aux[j], aux[i]))
				a[k] = a[j++];
			else
				a[k] = aux[i++];
		}
	}
}
