package com.logical;

public class LongestCountWord {

	public static void main(String[] args) {

		String name = "Kiran Thakare ";
		String longword = "";

		String[] split = name.split(" ");

		for (String s : split) {
			if (s.length() > longword.length()) {
				longword = s;
			}
		}

		System.out.println(longword);
	}
}
