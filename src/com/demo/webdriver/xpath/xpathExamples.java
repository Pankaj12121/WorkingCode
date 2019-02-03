package com.demo.webdriver.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class xpathExamples {
	WebDriver driver;

	@Test
	public void launchDriver() {
		System.setProperty("webdriver.chrome.driver", "\\Grid\\chromedriver.exe");
		driver = new ChromeDriver();
		String baseUrl = "https://www.amazon.com/";
		driver.get(baseUrl);
		clickElementUsingXpath();
	}

	public void clickElementUsingXpath() {
		
		WebElement category= driver.findElement(By.xpath("//*[@id='searchDropdownBox']"));
		category.click();
		
	}
}