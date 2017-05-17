package com.csk.algs;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class WeightedQuickUnionUnion_find {
	private int[] id; // 分量 ID
	private int[] sz; // 各个根节点所对应的分量的大小
	private int count; // 分量数量
	
	public static void main(String[] args) {
		int N = StdIn.readInt();
		WeightedQuickUnionUnion_find uf = new WeightedQuickUnionUnion_find(N);
		while(!StdIn.isEmpty()){
			int p = StdIn.readInt();
			int q = StdIn.readInt();
			if(uf.connected(p, q)) continue;
			uf.union(p, q);
			StdOut.println(p + "  " + q);
		}
		StdOut.println(uf.count() + "components");
	}
	
	/*
	 * 初始化
	 */
	public WeightedQuickUnionUnion_find(int N) {
		count = N;
		id = new int[N];
		for (int i = 0; i < N; i++)
			id[i] = i;
		sz = new int[N];
		for (int i = 0; i < N; i++)
			sz[i] = 1;
	}

	/*
	 *  连通分量的数量
	 */
	public int count() { 
		return count;
	}
	
	/*
	 * 	如果 p 和  q 存在同一个分量中则返回 true
	 */
	public boolean connected(int p,int q){
		return find(p) == find(q);
	}
	
	/*
	 * p(0 到 N - 1）所在的分量的标识符 
	 */
	public int find(int p){
		while(p != id[p])
			p = id[p];
		return p;
	}
	
	/*
	 * 在 p 和 q之间添加一条连接
	 */
	public void union(int p,int q){
		int i = find(p);
		int j = find(q);
		if(i == j) return;
		//将小树的根节点连接到大树的根节点
		if(sz[i] < sz[j]){
			id[i] = j;
			sz[j] += sz[i];
		}
		else {
			id[j] = i;
			sz[i] += sz[j];
		}
		count--;
	}
}
