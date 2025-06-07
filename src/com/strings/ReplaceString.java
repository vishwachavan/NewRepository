package com.strings;

public class ReplaceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="today is my day, today my passion";
		
		//replace my with your;
		
		s1=s1.replaceFirst("my", "yours");
		System.out.println(s1);
		
		s1=s1.replaceAll("today", "tomorrow");
		System.out.println(s1);
		
		//insert word sfter specifc string
		
	 //insert the string , and yours after my
		
		System.out.println(s1.replaceAll("my", "my and yours"));
		

	}

}
