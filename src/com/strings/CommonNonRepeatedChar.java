package com.strings;

import java.util.*;

public class CommonNonRepeatedChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="gainwell";
		String s2="technologies";
		
		//using map
		
		String combined=s1+s2;
		
		char[] c=combined.toCharArray();
		
		Map<Character, Integer> map=new LinkedHashMap<Character, Integer>();
		for(int i=0;i<c.length;i++) {
			
			map.put(c[i], map.getOrDefault(c[i], 0)+1);
			
		}
		
		for(Map.Entry<Character, Integer> m :map.entrySet())
		{
			if(m.getValue()==1)
			{
				System.out.println(m.getKey());
			}
		}
	}

}
