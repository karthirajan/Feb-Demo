package com.flipkart.stepdefinition;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartTask {
	
	static WebDriver driver;
	static long start;
	
	@BeforeClass //browser launch
	public static void launch() {
		
		System.out.println("browser launch");
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
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
		
		System.out.println("login test");
		
       try {
			 
			   WebElement button = driver.findElement(By.xpath("//button[text()='✕']"));
			   button.isDisplayed();
			   button.click();
			
	    	} catch (Exception e) {
	    		
			System.out.println("pop up is not displayed");
			
	    	}

	}
	
	@Test //methods
	public void method2() {
		
		System.out.println("search mobile");
		
		 WebElement search = driver.findElement(By.name("q"));
		   search.sendKeys("realme",Keys.ENTER);
		   
		   WebElement mobileName = driver.findElement(By.xpath("(//div[contains(text(),'realme')])[2]"));   
		   mobileName.click();

	}
	
	@Test //methods
	public void method3() {
		
		System.out.println("windows handling");
		
		String parentURL = driver.getWindowHandle();
		   
		   Set<String> childURL = driver.getWindowHandles();
		   for (String child : childURL) {
			   
			   if(!parentURL.equals(child)) {
				   
				   driver.switchTo().window(child);
				   
			   }
			
		
		   }

	}
	
	@Test //methods
	public void method4() {
		
		   WebElement mobileName2 = driver.findElement(By.xpath("//span[contains(text(),'realme')]"));
		   String name = mobileName2.getText();
		   System.out.println(name);
		   
		   Assert.assertTrue(mobileName2.isDisplayed());
		   Assert.assertEquals("realme Narzo 50A (Oxygen Green, 128 GB)  (4 GB RAM)", name);
		   
		   System.out.println("passed");
		
	}
	
	@Ignore
	@Test //methods
	public void method5() throws IOException {
		
		    TakesScreenshot tk = (TakesScreenshot)driver;	
			File source = tk.getScreenshotAs(OutputType.FILE);
			File dest = new File(".//target//report.png");		
			FileUtils.copyFile(source, dest);
		
	}
		
	
	

}
