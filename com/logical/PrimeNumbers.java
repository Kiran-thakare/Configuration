package com.logical;

import java.util.Scanner;

public class PrimeNumbers {
	
	public static void main(String[] args) {

		System.out.print("Enter number  :");
		int num = new Scanner(System.in).nextInt();
		
		for(int i=1;i<=num;i++) {
			boolean isPrime=true;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime) {
				System.out.print(i +",");
			}
		}
	}
}
