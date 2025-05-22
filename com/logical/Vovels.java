package com.logical;

public class Vovels {

	public static void main(String[] args) {

		String name = "Kiran Popat Thakare";
		int count = 0;
		int consocount=0;
		
		String vovel="";
		String consonants="";


		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U') {
				count++;
				vovel+=ch;
			}else {
				
				consocount++;
				consonants+=ch;
				
			}
			
		}
		System.out.println(vovel);
		System.out.println(count);
		System.out.println(consonants);
		System.out.println(consocount);
		
		
		
	}

}
