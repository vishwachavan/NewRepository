package com.arrays;

public class PrintFirstThreeMaximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {12,43,67,11,34,99,121,675};
		
		int firstMax= Integer.MIN_VALUE;
		int secondMax=Integer.MIN_VALUE;
		int thirdMAx=Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]>firstMax)
			{
				thirdMAx=secondMax;
				secondMax=firstMax;
				firstMax=a[i];
			}else if(a[i]>secondMax && a[i]!=firstMax)
			{
				thirdMAx=secondMax;
				secondMax=a[i];
				
			}else if(a[i]>secondMax && a[i]!=firstMax && a[i]!=secondMax)
			{
				thirdMAx=a[i];
			}
		}
		
		System.out.println("firstMax :"+firstMax);
		System.out.println("secondMax :"+secondMax);
		System.out.println("thirdMax :"+thirdMAx);

	}

}
