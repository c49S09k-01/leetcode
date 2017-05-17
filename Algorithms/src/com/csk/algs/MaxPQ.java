package com.csk.algs;

//有序堆实现的优先队列
public class MaxPQ<Key extends Comparable<Key>> { 		// 1. 泛型  	2.此泛型实现了 Comparable 接口
	private Key[] pq;
	private int N = 0;

	// 堆排序
	public static void sort(Comparable[] a) {
		int N = a.length;
		for (int k = N / 2; k >= 1; k--) // 构造堆
			// sink(a,k,N);
			while (N > 1) {
				// exch(a,1,N--);
				// sink(a,1,N);
			}
	}

	public MaxPQ(int maxN) {
		pq = (Key[]) new Comparable[N + 1]; // 可以理解为创建了 N + 1 个引用数组。引用类型为 接口类型
	}

	public boolean isEmpty() {
		return N == 0;
	}

	public int size() {
		return N;
	}

	public void insert(Key v) {
		pq[++N] = v;
		swim(N);
	}

	public Key delMax() {
		Key max = pq[1];
		exch(1, N--);
		pq[N + 1] = null;
		sink(1);
		return max;
	}

	private boolean less(int i, int j) {
		return pq[i].compareTo(pq[j]) < 0;
	}

	private void exch(int i, int j) {
		Key t = pq[i];
		pq[i] = pq[j];
		pq[j] = t;
	}

	private void swim(int k) {
		while (k > 1 && less(k / 2, k)) {
			exch(k / 2, k);
			k = k / 2;
		}
	}

	private void sink(int k) {
		while (2 * k < N) {
			int j = 2 * k;
			if (j < N && less(j, j + 1))
				j++;
			if (!less(k, j))
				break;
			exch(k, j);
			k = j;
		}
	}
}
