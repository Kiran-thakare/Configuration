package com.array;

public class FiboonaciNumber {
  
	public static void main(String[] args) {
		
		int num=10,n1=0,n2=1;
		
		for(int i=2;i<=num;i++) {
			
			int n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
			
		}
		
		
		int arm=153;
		int sum=0,rem;
		int temp=arm;
		
		while(temp!=0) {
			rem=temp%10;
			sum+=rem*rem*rem;
			temp=temp/10;
		}
		
		if(sum==arm) {
			System.out.println("arm");
		}else {System.out.println("not arm");}
		
	}
}
