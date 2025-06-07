package com.practice;

import java.util.function.Function;

@FunctionalInterface
interface calculator{
	
	int calculator(int a,int b);
	
}

public class FunctionalInterfaceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		calculator add=(a,b)-> a+b;
		
		calculator substract= (a,b)-> a-b;
		
		int x=10,y=5;
		
		System.out.println(add.calculator(x, y));
		System.out.println(substract.calculator(x, y));
		
		 Function<String, Integer> stringLength = str -> str.length();

	        System.out.println(stringLength.apply("Hello123")); // Output: 5
		
		
		

	}

}
