package com.demo.webdriver.menuNavigate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.demo.webdriver.implicitExplicitWait.BaseScript;

public class Test {

	static WebDriver driver;
	static BaseScript baseScript;
	public static void main(String[] args) throws InterruptedException {
		String url="https://www.myntra.com";
		baseScript= new BaseScript();

		driver=baseScript.launchDriverWithPara(url);
		
		submenuAction();


	}

	public static void submenuAction() throws InterruptedException {
		By men1=By.linkText("Men");
		By jackets1=By.xpath("//a[contains(text(),'Jackets & Coats')]");
		WebElement men= driver.findElement(By.linkText("Men"));
		
		

		men.click();
		WebElement jackets= driver.findElement(By.xpath("//a[contains(text(),'Jackets & Coats')]"));
		baseScript.actionClick(men1, jackets1);
		//jackets.click();
	}




}
