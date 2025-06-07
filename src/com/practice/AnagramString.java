package com.practice;

import java.util.Arrays;
import java.util.function.Function;

public class AnagramString {

	public static void main(String[] args) {
		
		 Function<String, Integer> stringLength = str -> str.length();

	        System.out.println(stringLength.apply("Hello123")); // Output: 5
		// TODO Auto-generated method stub
		String s1="keep";
		String s2="peek";
		System.out.println(s1);
		System.out.println(s2);
	//	s1=s1.replaceAll(" ", "");
	//	s2=s2.replaceAll(" ", "");
		
		if(s1.length()==s2.length()) {
			System.out.println("String lenghth equal");
			char c1[]=s1.toCharArray();
			char[] c2= s2.toCharArray();
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			if(Arrays.equals(c1, c2)) {
				System.out.println("Anagram");
			}else {
				System.out.println("Not anagram");
			}
		}

	}

}
