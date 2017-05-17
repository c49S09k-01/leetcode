package com.csk.algs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class Test {
	public int[] twoSum(int[] nums, int target) {
		int[] a = null;
		int n = nums.length;
		int[] temp = new int[n];
		for (int i = 0; i < n; i++)
			temp[i] = nums[i];
		int b;
		java.util.Arrays.sort(nums);
		for (int i = 0; i < n; i++) {
			b = binarySearch((target - nums[i]), nums);
			if (b > i) {
				a = new int[2];
				a[0] = binarySearch(nums[i], temp);
				a[1] = binarySearch(nums[b], temp);
				break;
			}
		}
		return a;
	}

	public int binarySearch(int key, int[] a) {
		int hi = a.length - 1;
		int lo = 0;
		int mid;
		while (lo <= hi) {
			mid = lo + (hi - lo) / 2;
			if (key < a[mid])
				hi = mid - 1;
			else if (key > a[mid])
				lo = mid + 1;
			else
				return mid;
		}
		return -1;
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(0,2);
		System.out.println(list);
//		LinkedHashMap<Integer, Integer> l =  new LinkedHashMap<>();
//		l.put(1, 1);
//		l.put(3,3);
//		l.put(2,2);
//		for(Integer i : l.keySet())
//			System.out.println(i);
//		File f = new File("csk.txt");  
//		System.out.println(f.getAbsolutePath());
//		In in = new In(f);
//		
//		while(!in.isEmpty())
//			System.out.println(in.readInt());
//		HashMap<A, Integer> map = new HashMap<>();
//		map.keySet();
//		System.out.println(map);
//		Collection<Integer> set = new HashSet<>();
//		set.add(2);
//		set.add(1);
//		set.add(3);
//		System.out.println(set.toString());
		// System.out.println(new Random(4).nextInt(10));
//		System.out.println("123".equals(null));
		// System.out.println(new Random(4).nextInt(10));
		// List<Integer> list = new ArrayList<>(3);
		// list.set(0, 1);
		// System.out.println(list.get(0));
		// int[] nums = {3,2,4};
		// System.out.println(new Test().binarySearch(4, nums));
		// int[] b = new Test().twoSum(nums, 6);
		// for(int a : b){
		// System.out.print(a + "\t");
	}
	// String s1 = "csk";
	// String s2 = "csk";
	// System.out.println(s1 == s2); //true
	// String s3 = new String("csk");
	// String s4 = new String("csk");
	// System.out.println(s3 == s4); // false
	// Stack<String> s = new Stack<>();
	// s.add(null);
	// new ConcurrentModificationException();
	// System.out.println(s.size());
	// Stack<String>[] ss = (Stack<String>[])new Stack[5];
	// Scanner s = new Scanner(System.in);
	// while(s.hasNext()){
	// System.out.println(s.nextLine());
	// }
	// while(!StdIn.isEmpty()){
	// System.out.println(StdIn.readString());
	// }
	// String s = "123456789";
	// System.out.println(s.substring(3, 5));
	// Stack<String> s = new Stack<>();
	// for(int i : s){
	// System.out.println(i);
	// }
	// System.out.printf("%14.4e", 51.2);
	// System.out.println(Double.NEGATIVE_INFINITY);
	// System.out.println(3 < 3.1);
	// System.out.println(1 / 0.0);
	// System.out.println("123" > "456");
	// System.out.println("123".compareTo("456"));
	// System.out.println("123".toString());
	// Object[] os = new Object[]{};
	// System.out.println("123".equals(null));
	// }
}
