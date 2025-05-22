package com.array;

import java.util.Scanner;

public class ArraySearchingElement {

	public static void main(String[] args) {

		int[] arr = { 20, 30, 60, 7, 8 };
		boolean found = false;
		System.out.print("Enter Value For Search...:-");
		int num=new Scanner(System.in).nextInt();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				found = true;
			}
		}

		if (found) {
			System.out.println(num + "  Found Number");
		} else {
			System.out.println(num + "  !...Not Found");
		}
	}
}
