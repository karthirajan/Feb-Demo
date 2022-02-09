package com.flipkart.stepdefinition;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;

//@RunWith(Suite.class)
//@Suite.SuiteClasses({FlipkartTask.class,AmazonTask.class})

public class TestRunner {

	public static void main(String[] args) {
		
		Result rs = JUnitCore.runClasses(FlipkartTask.class,AmazonTask.class);
		
		int run = rs.getRunCount();
		System.out.println("Total run :"+run);
		
		int failures = rs.getFailureCount();
		System.out.println("Total failures are :"+failures);
		
		int ignoreCount = rs.getIgnoreCount();
		System.out.println("Ignored methods are :"+ignoreCount);
		
		long runTime = rs.getRunTime();
		System.out.println("Total runtime :"+runTime);
		
		List<Failure> failures2 = rs.getFailures();
		for (Failure failure : failures2) {
			
			System.out.println(failure);
			
		}
	}
	
}
