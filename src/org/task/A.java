package org.task;

public class A {
	
	public static A a;
	
	private A() {
		
		//to restrict object creation outside.
		
	}
	
	public static A getInstance() {
		
		if(a == null) {
			
			a = new A();
			
		}
		
		return a;
		

	}
	
	
	public static void main(String[] args) {
		
		A a = new A();
		System.out.println(a);
		
		
		
	}

}
