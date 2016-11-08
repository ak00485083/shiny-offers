package com.tutorial.excercise;

public class MissingChar {

	
	private static char charAt;

	public static void main(String[] args) {
		
		String str="kitten";
		int i=3;
		StringBuffer str2=new StringBuffer(str);
		str2.deleteCharAt(2);
//		System.out.println(str2);
		
	charAt = str.charAt(str.length()-1);
	System.out.println(charAt+str+charAt);
	}
}
