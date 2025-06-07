package com.practice;

class Logger{
	private static Logger instance;
	
	private Logger() {
		System.out.println("Logger initialzed");
	}
	
	public static Logger getInstance() {
		
		if(instance==null) {
			instance=new Logger();
		}
		return instance;
		
	}
	
	public void log(String message) {
		
		System.out.println(message);
	}
	
}
public class SingleTonExample {

	public static void main(String[] args) {
		
		Logger l1=Logger.getInstance();
		Logger l2= Logger.getInstance();
		l1.log("first logger");
		l2.log("second logger");
		System.out.println(l1==l2);
		// TODO Auto-generated method stub

	}

}

