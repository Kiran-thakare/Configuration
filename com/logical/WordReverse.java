package com.logical;

public class WordReverse {

	public static void main(String[] args) {

		String name = "Kiran Thakare";

		String[] split = name.split(" ");

		for (int i = split.length - 1; i >= 0; i--) {
			System.out.print(split[i] + " ");
		}
		
		
		String num="12345";
		
		System.out.println(characterCheck(name));
		System.out.println(characterCheck(num));
		
		

	}

	private static boolean characterCheck(String num) {
		for(int i=0;i<num.length();i++) {
			char ch = num.charAt(i);
			if(Character.isDigit(ch)) {
				return true;
				
			}
		}
		return false;
		
	}
	
	
}
