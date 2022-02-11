package org.fifth;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class KeyValue {
	
	public static void main(String[] args) {
		
		Map<Integer, String> x = new LinkedHashMap<Integer, String>();
		
		x.put(1, "sabarish");
		x.put(2, "sabarish");
		x.put(3, "karthi");
		x.put(null, "sabarish");
		x.put(1, "sabarish");
		x.put(null, "sabarish");
		
		System.out.println(x);
		
		System.out.println(x.get(3));
		
		Set<Entry<Integer, String>> entrySet = x.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			
			System.out.println(entry.getKey()+"  : "+entry.getValue());
		
		}
											
	}

}
