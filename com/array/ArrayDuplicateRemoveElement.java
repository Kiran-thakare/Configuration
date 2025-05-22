package com.array;

public class ArrayDuplicateRemoveElement {
 
	public static void main(String[] args) {
		String name = "Kiran Thakare";
		String rev = "";
		
		for(int i=0;i<name.length();i++) {
			if(rev.indexOf(name.charAt(i))==-1) {
				rev+=name.charAt(i);
			}
		}
		System.out.println(rev);
	}
}
