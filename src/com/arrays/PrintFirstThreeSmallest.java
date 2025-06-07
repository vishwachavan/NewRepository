package com.arrays;

public class PrintFirstThreeSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {23,12,54,27,78};
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
			
		}
		for(int k=0;k<a.length;k++) {
			System.out.println(a[k]);
		}
		
		for(int i=0;i<3;i++) {
			System.out.println(a[i]);
		}

	}

}
