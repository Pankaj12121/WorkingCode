package com.demo.webdriver.webpageActions;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AutoCompleteActions {
	WebDriver driver;
	WebDriverWait wait;
	WebElement textBoxElement;

	String URL = "http://jqueryui.com/autocomplete/";
	private By frameLocator = By.className("demo-frame");
	private By tagText = By.id("tags");
	@Test
	public void launchdriver(){
		
		System.setProperty("webdriver.chrome.driver","\\Grid\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to(URL);
		wait= new WebDriverWait(driver, 20);
		WebElement frameElement=driver.findElement(frameLocator);
		
		driver.switchTo().frame(frameElement);
		textBoxElement = driver.findElement(tagText);
		textBoxElement.clear();
		textBoxElement.sendKeys("a");
		selectAutoCompleteElement("Java");
	}
	
	public void selectAutoCompleteElement(String textToSelect) {
		try {
			WebElement autoOptions = driver.findElement(By.id("ui-id-1"));
			Thread.sleep(2000);
			List<WebElement> optionsToSelect = autoOptions.findElements(By.xpath("//li"));
			for(WebElement option : optionsToSelect){
		        if(option.getText().equals(textToSelect)) {
		        	System.out.println("Trying to select: "+textToSelect);
		            option.click();
		            break;
		        }
		    }
			
		} catch (NoSuchElementException e) {
			System.out.println(e.getStackTrace());
		}
		catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
	}

}
