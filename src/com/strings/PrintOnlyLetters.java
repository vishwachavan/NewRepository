package com.strings;

public class PrintOnlyLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="1233abcdefghj#$%";
		String res="";
		char[] c=s1.toCharArray();
		
		for(int i=0;i<c.length;i++) {
			
			if(Character.isLetter(c[i])) {
				
				res=res+c[i];
			}
		}
		
		System.out.println(res);
	}

}
