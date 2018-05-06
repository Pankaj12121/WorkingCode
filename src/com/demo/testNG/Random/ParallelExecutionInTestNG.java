package com.demo.testNG.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelExecutionInTestNG {
	WebDriver driver;
	@Test(groups={"TestNG","demo","TC010","parallelExecution"})
	@Parameters({"browsername"})
	public void chromeTest(String browserNmae){

		System.out.println("The current browser is "+browserNmae);

		System.setProperty("webdriver.chrome.driver","\\Grid\\chromedriver.exe");
		driver = new ChromeDriver();
		String baseUrl = "http://opensource.demo.orangehrmlive.com/";
		driver.get(baseUrl);
		//driver.manage().window().maximize();//maximize browser

		String ExpectedErrorMsg="Invalid credentials";
		WebElement userName= driver.findElement(By.id("txtUsername"));//By id 
		WebElement password= driver.findElement(By.name("txtPassword"));//By name 
		WebElement submit= driver.findElement(By.className("button"));//By name 

		userName.sendKeys("Admin");
		password.sendKeys("Admin");
		submit.click();

		WebElement errMsg= driver.findElement(By.xpath("//div[span='Invalid credentials']"));//By xpath
		String ActualErrMsg=errMsg.getText();

		if (ActualErrMsg.contentEquals(ExpectedErrorMsg)){
			System.out.println("Test case passed");
		}else{
			System.out.println("Test case failed");
			
		}
		driver.quit();
	}
	@Test(groups={"TestNG","demo","TC010","parallelExecution"})
	@Parameters({"browsername"})
	public void mozillaTest(String browserNmae){

		System.out.println("The current browser is "+browserNmae);

		System.setProperty("webdriver.gecko.driver","\\Grid\\geckodriver.exe");
		driver = new FirefoxDriver();
		String baseUrl = "http://opensource.demo.orangehrmlive.com/";
		driver.get(baseUrl);
		//driver.manage().window().maximize();//maximize browser

		String ExpectedErrorMsg="Invalid credentials";
		WebElement userName= driver.findElement(By.id("txtUsername"));//By id 
		WebElement password= driver.findElement(By.name("txtPassword"));//By name 
		WebElement submit= driver.findElement(By.className("button"));//By name 

		userName.sendKeys("Admin");
		password.sendKeys("Admin");
		submit.click();

		WebElement errMsg= driver.findElement(By.xpath("//div[span='Invalid credentials']"));//By xpath
		String ActualErrMsg=errMsg.getText();

		if (ActualErrMsg.contentEquals(ExpectedErrorMsg)){
			System.out.println("Test case passed");
		}else{
			System.out.println("Test case failed");
			
		}

		driver.quit();

	}
}

