package com.csk.algs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test1{
    public int[] twoSum(int[] nums, int target) {
	        int[] a = null;
	        int n = nums.length;
	        int[] temp = new int[n];
	        for(int i = 0;i < n;i++)
	        	temp[i] = nums[i];
	        int b;
	        java.util.Arrays.sort(nums);
	        for(int i = 0;i < n;i++){
	            b = binarySearch((target - nums[i]),nums);
	            if(b > i){
	                a = new int[2];
	                a[0] = binarySearch(nums[i], temp);
	                a[1] = binarySearch(nums[b], temp);
	                break;
	            }
	        }
	        return a;
	    }
	    public int binarySearch(int key,int[] a){
	        int hi = a.length - 1;
	        int lo = 0;
	        int mid ;
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
	    public static void main(String[] args) {
	    	Arrays.sort(new Object[10]);;
	    	Map<Integer, Integer> map = new HashMap<>();
	    	map.put(1, null);
	    	System.out.println(map.get(2));
//			int nums[] = {3,2,4};
//			int[] a = new Test1().twoSum(nums, 6);
//			for(int b : a)
//				System.out.println(b);
		}
}
