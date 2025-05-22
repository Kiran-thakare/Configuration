package com.logical;

public class CountCharacter {

	public static void main(String[] args) {

		String name = "kiranthakare1727@gmail.com";

		String digit = "";
		String letter = "";
		String specialChar = "";

		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (Character.isDigit(ch)) {
				digit += ch;
			} else if (Character.isLetter(ch)) {
				letter += ch;
			} else {
				specialChar += ch;
			}
		}
		
		System.out.println(digit);
		System.out.println(letter);
		System.out.println(specialChar);
	}
}
