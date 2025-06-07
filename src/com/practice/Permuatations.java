package com.practice;

class PermuatationsExample{
	
	 void permuatation(String input, String res)
	{
		if(input.length()==0) {
			
			System.out.println(res);
			return;
		}
		for(int i=0;i<input.length();i++) {
			
			char c=input.charAt(i);
			String rest=input.substring(0, i)+ input.substring(i+1);
			permuatation(rest,res+c);
			
		}
	}
	
	 

}

public class Permuatations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="ABC";
		PermuatationsExample p=new PermuatationsExample();
		p.permuatation(s1,"");
		

	}



}
