package com.array;

public class PrimeNumbers {

	public static void main(String[] args) {
		int num = 5;
		int count = 0;
		for (int i = 2; i <= num; i++) {
			if (num % i == 0) {
				count = count + 1;
			}

		}
		if (count == 1) {
			System.out.println("number is Prime ");
		} else {
			System.out.println("number is Not prime");
		}

		
		
		

	}
}
