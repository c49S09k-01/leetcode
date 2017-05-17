package com.csk.algs;

import static com.csk.algs.Example.*;

//三向切分的快速排序
//适合存在大量重复元素的数组,排序时间从线性对数级降低到了线性级别。
public class Quick3way {
	private static void sort(Comparable[] a, int lo, int hi) {
		if (hi <= lo)
			return;
		int lt = lo, i = lo + 1, gt = hi;
		Comparable v = a[lo];
		while (i <= gt) {
			int cmp = a[i].compareTo(v);
			if (cmp < 0)
				exch(a, lt++, i++);
			else if (cmp > 0)
				exch(a, i, gt--);
			else
				i++;
		}
		sort(a, lo, lt - 1);
		sort(a, gt + 1, hi);
	}
}
