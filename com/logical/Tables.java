package com.logical;

import java.util.Scanner;

public class Tables {

	public static void main(String[] args) {
		
		System.out.print("Enter number to create Table :");
		int num=new Scanner(System.in).nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println("2 * " + i + " = " + num * i);
		}
	}
}
