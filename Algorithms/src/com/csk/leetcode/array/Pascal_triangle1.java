package com.csk.leetcode.array;

import java.util.ArrayList;
import java.util.List;

/*
 * Given numRows, generate the first numRows of Pascal's triangle.

For example, given numRows = 5,
Return

[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]  
 */
public class Pascal_triangle1 {
	public static void main(String[] args) {
		for (List<Integer> i : new Pascal_triangle1().generate(5))
			System.out.println(i);
	}

	// 我自己的方法
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		List<Integer> temp;
		for (int i = 1; i <= numRows; i++) {
			temp = new ArrayList<>(i);
			for (int j = 1; j <= i; j++) {
				if (j == 1 || i == j)
					temp.add(1);
				else
					temp.add(list.get(i - 2).get(j - 2) + list.get(i - 2).get(j - 1));
			}
			list.add(temp);
		}
		return list;
	}

	// 别人的方法,感觉很巧妙
	public List<List<Integer>> generate1(int numRows) {
		List<List<Integer>> allrows = new ArrayList<List<Integer>>();
		ArrayList<Integer> row = new ArrayList<Integer>();
		for (int i = 0; i < numRows; i++) {
			row.add(0, 1);
			for (int j = 1; j < row.size() - 1; j++)
				row.set(j, row.get(j) + row.get(j + 1));
			allrows.add(new ArrayList<Integer>(row));
		}
		return allrows;
	}
}
