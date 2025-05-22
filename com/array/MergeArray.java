package com.array;

import java.util.Arrays;

public class MergeArray {
	public static void main(String[] args) {

		int[] first = { 1, 3, 4, 5, 7 };
		int[] secound = { 2, 6, 8, 9, 10 };

		int[] n = new int[first.length + secound.length];

		for (int i = 0; i < first.length; i++) {
			n[i] = first[i];

		}

		for (int i = 0; i < secound.length; i++) {
			n[first.length + i] = secound[i];

		}
		Arrays.sort(n);
		System.out.println(Arrays.toString(n));
	}
}
