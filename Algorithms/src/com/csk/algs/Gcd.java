package com.csk.algs;

public class Gcd {
	// 用欧几里得法求最大公约数(非递归)
	public static int gcd1(int p, int q) {
		int temp;
		if (q == 0)
			return p;
		else{
		while (q != 0) {
			temp = q;
			q = p % q;
			p = temp;
		}
		return p;
	}
}
		
	//递归
		public static int gcd2(int p,int q){
			if(q == 0)
				return p;
			int r = p % q;
			return gcd2(q,r);
}

	public static void main(String[] args) {
		System.out.println(gcd1(3,10));
		System.out.println(gcd2(6,3));
	}
}
