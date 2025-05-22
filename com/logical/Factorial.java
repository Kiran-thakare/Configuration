package com.logical;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		System.out.print("Enter number  :");
		int num = new Scanner(System.in).nextInt();

		int fact = 1;

		for (int i = 1; i <= num; i++) {
			fact *= i;
		}

		System.out.println(fact);
		
		
		int i=1 ,fac=1;
		int ranage=10;
		while(i<=ranage) {
			fac*=i;
			i++;
		}
		System.out.println(fac);
	}
}
