package org.task;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class factorial {
	
	public static void main(String[] args) {
		
		
		String s = "java programs session java";
		
		Map<Character, Integer> m = new HashMap<Character, Integer>();
		
			
		char[] ch = s.toCharArray();
		
		for (char x : ch) { 
			
			if(m.containsKey(x)) {
				
				Integer i = m.get(x);
				m.put(x, i+1);
				
			}else {
				m.put(x, 1);
			}
			
			
		}
		
		System.out.println(m);
		

		
	}

}
