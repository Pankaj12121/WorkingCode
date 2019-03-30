package com.demo.webdriver.random;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintValuesInDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","\\Grid\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[input[@tabindex='4']]//a")).click();
		List<WebElement> cities = driver.findElement(By.xpath("//li[@class='ui-menu-item']"));
		System.out.println("Number of cities : "+cities.size()); //this will take only those which are visible in 1st click
		for(int i=0; i<cities.size(); i++){
			System.out.println(i+1+") city name: "+cities.get(i).getText());
		}
		driver.close();
	}
}


