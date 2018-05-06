package com.demo.datadriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {


	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "\\Grid\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.remiges.in/");

		Thread.sleep(1000);
		driver.findElement(By.linkText("Contact")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("template-contactform-name")).sendKeys("Dont use fancy code for simple things");

		//driver.close();


	}

}


