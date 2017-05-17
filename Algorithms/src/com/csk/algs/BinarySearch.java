package com.csk.algs;
//二分查找
public class BinarySearch {
	
	//数组 a 必须是有序的
	public static int rank(int key,int[] a){
		int mid;
		int lo = 0;
		int hi = a.length - 1;
		while(lo <= hi){
			mid = lo + (hi - lo) / 2;
			if(key < a[mid])
				hi = mid - 1;
			else if(key > a[mid])
					lo = mid + 1;
				 else return mid;
		}
		return -1;
	}
	
	//可进行单元测试
	public static void main(String[] args) {
		
	}
}