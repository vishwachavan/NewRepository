package com.practice;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="java sql db java sql maths";
		String[] s2=s1.split(" ");
		String s3="";
		for(int i=0;i<s2.length;i++) {
			
			if(!s1.contains(s2[i])) {
				s3=s3+s2[i];
			}
		}
		System.out.println(s3);

	}

}
