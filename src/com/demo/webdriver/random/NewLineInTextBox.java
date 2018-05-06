package com.demo.webdriver.random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class NewLineInTextBox {
	WebElement adminMenu;
	WebElement organization;
	WebElement generalInfo;
	WebElement editButton;
	WebElement note;
	WebElement save;
	WebElement userName;
	WebElement password;
	WebElement submit;
	static WebDriver driver;

	NewLineInTextBox(){
		userName= driver.findElement(By.id("txtUsername"));//By id 
		password= driver.findElement(By.name("txtPassword"));//By name 
		submit= driver.findElement(By.className("button"));//By name 
	}

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","\\Grid\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/");
		NewLineInTextBox obj= new NewLineInTextBox();
		obj.fillLoginDetails();
		obj.menuNaviagte();
		obj.pageElement(driver);
		obj.updateGenInfo();

	}
	public void pageElement(WebDriver driver){
		editButton=driver.findElement(By.id("btnSaveGenInfo"));
		note=driver.findElement(By.id("organization_note"));
		save=driver.findElement(By.id("btnSaveGenInfo"));
	}

	public void fillLoginDetails(){
		userName.sendKeys("Admin");
		password.sendKeys("admin");
		password.sendKeys(Keys.TAB);
		submit.submit();

	}

	public void updateGenInfo(){
		editButton.click();
		note.clear();
		note.sendKeys(("Open Sourec Software \n useful for demo \n demo scripts build using HRM \n thanks HRM Team"));
		save.click();
	}

	public void menuNaviagte() throws InterruptedException{
		Thread.sleep(3000);
		Actions action=new Actions(driver);
		adminMenu=driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']/b"));
		action.moveToElement(adminMenu).perform();
		Thread.sleep(1000);
		organization=driver.findElement(By.xpath("//a[@id='menu_admin_Organization']"));
		action.moveToElement(organization).perform();
		Thread.sleep(1000);
		generalInfo=driver.findElement(By.xpath("//a[@id='menu_admin_viewOrganizationGeneralInformation']"));
		Thread.sleep(1000);
		action.click(generalInfo).perform();
	}

}
