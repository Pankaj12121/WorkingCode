package com.demo.webdriver.LaunchDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleChromeLaunch {
	 static WebDriver driver ;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","\\Grid\\chromedriver.exe");
		driver = new ChromeDriver();
		String baseUrl = "http://newtours.demoaut.com/";  
		String expectedTitle = "Find a Flight: Mercury Tours:";
		String actualTitle = "";
		driver.get(baseUrl);
		
		
		WebElement username= driver.findElement(By.name("userName"));
		WebElement pass= driver.findElement(By.name("password"));
		String actualLablePasswordField=pass.getText();
		String expectedLablePasswordField="password:";
		
		username.sendKeys("tutorial");
		//WebElement password= driver.findElement(By.xpath("//div/div[1]/div[4]/div[2]/div/div[1]"));
		pass.sendKeys("tutorial");
		actualTitle = driver.getTitle();
		if(actualLablePasswordField.equalsIgnoreCase(expectedLablePasswordField)){
			System.out.println("Testcase passed with equaliqnore string method");
		}
		if(actualLablePasswordField.equals(expectedLablePasswordField)){
			System.out.println("Testcase passed with equal string method");
		}else{
			System.out.println("Testcase failed with equal string method");
		}
		if (actualTitle.contentEquals(expectedTitle)){
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Failed");
		}

		driver.close();

	}

}