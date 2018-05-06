package com.demo.pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryDemo {

	@FindBy(id= "txtUsername") 
	private WebElement userName;
	@FindBy(name= "txtPassword") 
	private WebElement password;
	@FindBy(className= "button") 
	private WebElement loginBtn;
	private static WebDriver driver;

	public PageFactoryDemo(WebDriver driver){
		this.driver = driver;
		//This initElements method will create all WebElements
		PageFactory.initElements(driver, this);

	}

	public void userLogin(String UserName, String pass) {
		userName.sendKeys(UserName);
		password.sendKeys(pass);
		loginBtn.click();
	}

	public static void main(String[] args) {
		String UserName="Admin";
		String Pass= "admin";
		System.setProperty("webdriver.chrome.driver","\\Grid\\chromedriver.exe");
		driver = new ChromeDriver();
		String baseUrl = "http://opensource.demo.orangehrmlive.com/";
		driver.get(baseUrl);
		PageFactoryDemo Obj = new PageFactoryDemo(driver);
		Obj.userLogin(UserName, Pass);
		driver.close();

	}
}


