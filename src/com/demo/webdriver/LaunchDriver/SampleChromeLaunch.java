package com.demo.webdriver.LaunchDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleChromeLaunch {
	static WebDriver driver ;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","\\Grid\\chromedriver.exe");
		//driver = new ChromeDriver();
		String baseUrl = "https://www.upsrtconline.co.in/#";
		String expectedTitle = "OrangeHRM1";
		String actualTitle = "";
		driver.get(baseUrl);
		actualTitle = driver.getTitle();
		if (actualTitle.contentEquals(expectedTitle)){
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Failed");
		}

		driver.close();

	}

}