package com.logical;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		System.out.print("Enter number  :");
		int num = new Scanner(System.in).nextInt();
		int rev = 0;
		int rem;
		int temp = num;
		while (temp > 0) {
			rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;
		}

		System.out.println(rev);
	}
	
	

}
