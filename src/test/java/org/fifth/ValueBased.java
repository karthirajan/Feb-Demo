package org.fifth;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ValueBased {
	
	public static void main(String[] args) {
		
		Set<Integer> a = new TreeSet<Integer>();
		
		a.add(5);
		a.add(10);
		a.add(15);
		a.add(25);
		a.add(20);
		a.add(15);					//set won't allow duplicates
		
		System.out.println(a);
		
		for (Integer x : a) {
			
			System.out.println(x);
			
		}
		
		
	}

}
