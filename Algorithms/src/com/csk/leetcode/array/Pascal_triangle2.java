package com.csk.leetcode.array;

import java.util.ArrayList;
import java.util.List;

// 1 2 4 7 11 16
//    3 6 10 15
// 8 4 5   5 2 3  
public class Pascal_triangle2 {
	public static void main(String[] args) {
		System.out.println(new Pascal_triangle2().getRow(3));
	}

	public List<Integer> getRow(int rowIndex) {
		List<Integer> list = new ArrayList<>(rowIndex + 1);
		int[] arrs = new int[rowIndex + 1];
		int[] temp = new int[rowIndex + 1];
		for (int i = 0; i < rowIndex + 1; i++) {
			for(int j = 0;j <= i;j++){
				if(j == 0 || j == i){
					arrs[j] = 1;
					temp[j] = 1;
				}
				else{
					if(i % 2 == 0)
						arrs[j] = temp[j - 1] + temp[j];
					else
						temp[j] = arrs[j - 1] + arrs[j];
					}
			        }
			}
		for(int i = 0;i < rowIndex + 1;i++)
			if((rowIndex + 1) % 2 == 0)
			list.add(temp[i]);
			else list.add(arrs[i]);
			return list;
	}
	
}
