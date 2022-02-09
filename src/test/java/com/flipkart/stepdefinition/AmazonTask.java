package com.flipkart.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTask {
	
	static WebDriver driver;
	static long start;
	
	@BeforeClass //browser launch
	public static void launch() {
		
		System.out.println("browser launch");
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

	}
	
	@AfterClass //browser quit
	public static void close() {
		
		driver.quit();

	}
	
	@Before //start time of method
	public void startTime() {
		
		 start = System.currentTimeMillis();

	}
	
	@After //end time of method
	public void endTime() {
		
		long end = System.currentTimeMillis();
		long tt = end - start;
		
		System.out.println("Time taken :"+ tt);

	}
	
	@Test //methods
	public void method1() {
		
		System.out.println("search mobile");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles",Keys.ENTER);

	}

}
