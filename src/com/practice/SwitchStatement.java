package com.practice;

public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String browser="ch";
		
		switch(browser) {
		
		case "ch" :
			
			System.out.println("chrome browser");
			
			
		case "FF" :
			System.out.println("firefox");
			
		case "IE":
			System.out.println("IE");
			break;
			
			default:
				System.out.println("default browser");
			
			
		}

	}

}
