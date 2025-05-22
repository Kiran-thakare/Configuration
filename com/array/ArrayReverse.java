package com.array;

public class ArrayReverse {

	public static void main(String[] args) {

		int[] arr = { 10, 20, -20, -30, 50 };
		String name = "Kiran Thakare";
		String rev = "";

		for (int i = arr.length-1 ; i >= 0; i--) {
			System.out.println(arr[i]);
		}

		for (int i = name.length()-1; i >= 0; i--) {
			rev += name.charAt(i);
		}
		
		System.out.println(rev);
		
		
	}
}
