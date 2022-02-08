package org.task;

import java.util.Scanner;

public class Programs {
	
	public static void main(String[] args) {
		
		
		int even = 0;
		int count1 = 0;
		
		int sumeven = 0;//2
		int sumodd = 0;
		
		for (int i = 1; i <= 100; i++) {
	
		
		if(i%2 == 0) {
			
			System.out.println("even number :"+i);
			even++;
			
			//2+4+6+8
			sumeven = sumeven + i;
			
		}else {
			
			System.out.println("odd number :"+i);
			sumodd = sumodd+i;
			
			count1++;
			
		}
		
		}
		
		System.out.println("Total even numbers are :"+even);
		System.out.println("Total odd numbers are :"+count1);
		
		System.out.println(sumeven);
		System.out.println(sumodd);
		
	}

}
