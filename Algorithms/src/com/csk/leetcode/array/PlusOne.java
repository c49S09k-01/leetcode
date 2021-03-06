package com.csk.leetcode.array;

/*
 * Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.

You may assume the integer do not contain any leading zero, except the number 0 itself.

The digits are stored such that the most significant digit is at the head of the list.
 */
public class PlusOne {
	public static void main(String[] args) {
		int[] digits = {1,2,3,4,9};
		new PlusOne().plusOne(digits);
		for (int i = 0; i < digits.length; i++) {
			System.out.print(digits[i] + "   ");
		}
	}
	public int[] plusOne(int[] digits) {
		for(int i = digits.length - 1;i >= 0;i--){
			if(digits[i] < 9){
				digits[i]++;
				return digits;
			}
			digits[i] = 0;
		}
		int[] temp = new int[digits.length + 1];
		temp[0] = 1;
		return temp;
	}
}
