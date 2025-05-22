package com.array;

import java.util.Arrays;

public class ArrayLastAllNegativeNumber {

	public static void main(String[] args) {
		int[] arr = { -1, -30, 70, -8, 50, 40 };
		int[] result = new int[arr.length];
		int j = 0;

		for (int i : arr) {
			if (i >= 0) {
				result[j] = i;
				j++;
			}
		}
		
		for (int i : arr) {
			if (i <= 0) {
				result[j] = i;
				j++;
			}
		}
		System.out.println(Arrays.toString(result));
	}
}
