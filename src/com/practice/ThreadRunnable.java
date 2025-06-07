package com.practice;

class SampleExample implements Runnable{
	
	public void run() {
		
		for(int i=0;i<3;i++)
		{
			System.out.println(Thread.currentThread().getName() + i);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
public class ThreadRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SampleExample s1= new SampleExample();
		
		SampleExample s2= new SampleExample();
		
		Thread t1=new Thread(s1);
		Thread t2=new Thread(s2);
		t1.start();
		t2.start();
		
	}

}
