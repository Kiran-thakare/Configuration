package com.array;

public class MaxNumber {
 
	public static void main(String[] args) {
		
		int []arr= {20,30,50,100,90,10};
		int max=arr[0];
		int min=arr[0];
		
		for(int i:arr) {
			if(i>max) {
				max=i;
			}
		}
		
		for(int i:arr) {
			if(i<min) {
				min=i;
			}
		}
		
		System.out.println(max);
		System.out.println(min);
		
	}
}
