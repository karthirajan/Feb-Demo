package org.emp;

import java.awt.AWTException;
import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Employee{
public static void main(String[]args) throws Throwable{
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SIVA\\eclipse-workspace\\EmployeeDetails\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	String url = "https://www.techlistic.com/p/demo-selenium-practice.html";
	driver.navigate().to(url);
	driver.manage().window().maximize();
	
	List<WebElement> iTable = driver.findElements(By.tagName("table"));
	for (int i = 0; i < iTable.size(); i++) {
		WebElement table = iTable.get(i);
		WebElement body = table.findElement(By.tagName("tbody"));
		List<WebElement> iRow = body.findElement(By.tagName("tr"));
		for (int j = 0; j <iRow.size(); j++) {
			WebElement row = iRow.get(j);
		List<WebElement> iData = row.findElement(By.tagName("td"));
		for (int k = 0; k < iData.size(); k++);
		WebElement data = iData.get(k);
		String text = data.getText();
		System.out.println(text);
		}
	}
}
}