package com.array;

public class DuplicationRemoveInArray {

	public static void main(String[] args) {

		int arr[] = { 3, 8, 2, 2, 5, 3 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[j]);
					break;
				}
			}

		}
		
		int num =12345;
		String n = Integer.toString(num);
		System.out.println(n.length());

		
	}
}
