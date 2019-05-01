package com.demo.webdriver.LaunchDriver;
<<<<<<< HEAD

import java.net.MalformedURLException;
import java.net.URL;
=======
>>>>>>> d38b64bf09683a98e4f74db7323d39b95b40d241

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SampleLocatorsScripts {
	
	static WebDriver driver ;
	public static void main(String[] args) throws MalformedURLException {
		//System.setProperty("webdriver.chrome.driver","\\Grid\\chromedriver.exe");
		//driver = new ChromeDriver();
		DesiredCapabilities capability= new DesiredCapabilities().chrome();
		String gridURL="http://localhost:4444/wd/hub";
		
		WebDriver driver = new RemoteWebDriver(new URL(gridURL),capability);
		String baseUrl = "http://opensource.demo.orangehrmlive.com/";
		driver.get(baseUrl);
		driver.manage().window().maximize();//maximize browser
		
		String ExpectedErrorMsg="Invalid credentials";
		WebElement userName= driver.findElement(By.id("txtUsername"));//By id 
		WebElement password= driver.findElement(By.name("txtPassword"));//By name 
		WebElement submit= driver.findElement(By.className("button"));//By name 
	
		userName.sendKeys("admin");
		password.sendKeys("admin");
		submit.click();
		
		WebElement errMsg= driver.findElement(By.xpath("//div[span='Invalid credentials']"));//By xpath
		String ActualErrMsg=errMsg.getText();
		
		if (ActualErrMsg.contentEquals(ExpectedErrorMsg))
			System.out.println("Test case passed");
		else
			System.out.println("Test case failed");
		
		driver.close();
		
		
	}
	

}
