package org.emp;

import java.awt.Robot;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class EmployeeDetails {

	public static void main(String[]args) throws InterruptedException, Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SIVA\\eclipse-workspace\\EmployeeDetails\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.techlistic.com/p/demo-selenium-practice.html";
		driver.get(url);
		driver.manage().window().maximize();
		
		List<WebElement> header = driver.findElements(By.xpath("(.//*[@dir='ltr']/table)[1]/tbody/tr/th"));
		List<WebElement> company = driver.findElements(By.xpath("(.//*[@dir='ltr']/table)[1]/tbody/tr/td[1]"));
		List<WebElement> contact = driver.findElements(By.xpath("(.//*[@dir='ltr']/table)[1]/tbody/tr/td[2]"));
		List<WebElement> country = driver.findElements(By.xpath("(.//*[@dir='ltr']/table)[1]/tbody/tr/td[3]"));
		
		for(int r = 0; r<header.size(); r++ ) {
			if(header.get(r).getText().equals("Country")) {
				System.out.println(country.get(r).getText());
			}
			
		}
	}
}
