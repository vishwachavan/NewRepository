package com.strings;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s1 = "listen";
	        String s2 = "silent";
	        
	        s1=s1.replaceAll("\\s", "");
	        s2=s2.replaceAll("\\s", "");
	        
	        char[] c1=s1.toCharArray();
	        
	        char[] c2=s2.toCharArray();
	        Arrays.sort(c1);
	        Arrays.sort(c2);
	        if(Arrays.equals(c1, c2)) {
	        	System.out.println("Anagram string");
	        }else {
	        	System.out.println("not");
	        }
	        
	        

	}

}
