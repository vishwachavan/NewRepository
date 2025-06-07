package com.practice;
class Sample extends Thread{
	
	public void run() {
		
		for(int i=0;i<3;i++) {
			
			System.out.println(getName() + " :"+ i);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
	}
}

public class MultiThreadDemo{
	public static void main(String[] args) {
		
		Sample t1=new Sample();
		
		Sample t2=new Sample();
		
		t1.setName("Thread 1");
		t2.setName("Thread 2");
		t1.start();
		t2.start();
		
	}
}
	
	

