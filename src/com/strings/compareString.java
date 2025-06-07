package com.strings;

public class compareString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="hello";
		String s2="hEllo";
		
		String s3=new String("hello");
		
	System.out.println(s1==s2);
	
	System.out.println(s1.equalsIgnoreCase(s2));
	
	System.out.println(s1==s3);

	}

}
