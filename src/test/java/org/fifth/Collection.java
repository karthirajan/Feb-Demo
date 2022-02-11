package org.fifth;

import java.util.ArrayList;
import java.util.List;

public class Collection {
	
	public static void main(String[] args) {
		
		List<Integer> a = new ArrayList<Integer>();
		
		a.add(5);
		a.add(10);
		a.add(15);
		a.add(20);
		a.add(25);
		a.add(15);
		
		System.out.println(a);
		System.out.println(a.get(2));
		
		for (int i = 0; i < a.size(); i++) {
			
			System.out.println(a.get(i));
			
		}
	}

}
