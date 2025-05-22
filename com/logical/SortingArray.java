package com.logical;

import java.util.Arrays;

public class SortingArray {
	public static void main(String[] args) {

		int arr[] = { 5, 3, 7, 1, 8, 9 };
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		int num = 3;
		boolean f = false;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] == num) {
				f = true;
				break;
			}
		}

		if (f) {
			System.out.println("number Found" + num);
		}

		System.out.println(Arrays.toString(arr));
	}
}
