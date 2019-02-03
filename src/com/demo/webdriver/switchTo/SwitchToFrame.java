package com.demo.webdriver.switchTo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToFrame {
	static WebDriver driver;
	public static void main(String[] args) {
		SwitchToFrame Objswitchclass=new SwitchToFrame();
		System.setProperty("webdriver.chrome.driver","\\Grid\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://merchant.juspay.in/merchant/iframe-demo");
		//driver.manage().window().maximize();
		Objswitchclass.totalNumberOfFramesByJavaScript();
		Objswitchclass.totalNumberOfFramesByTagName();

		//Action in default frame first time
		Objswitchclass.defaulframeFirstTime();
		
		//SwitchTo Frame by index
		Objswitchclass.switchToFramebyIndex(0); 

		//Action in switched frame
		Objswitchclass.actionInSwitchedFrame();

		//Again Switch back To default frame
		driver.switchTo().defaultContent();

		//Action in default frame second time
		Objswitchclass.defaulframesecondTime();
		
		// Close browser
		Objswitchclass.closeBrowser();
	}

	public int totalNumberOfFramesByJavaScript(){
		//By executing a java script
		JavascriptExecutor exe = (JavascriptExecutor) driver;
		Integer numberOfFrames = Integer.parseInt(exe.executeScript("return window.length").toString());
		System.out.println("Number of iframes using javascript on the page are " + numberOfFrames);

		return numberOfFrames;
	}
	public int totalNumberOfFramesByTagName(){
		//By finding all the web elements using iframe tag
		List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
		System.out.println("The total number of iframes using tagname are " + iframeElements.size());
		Integer numberOfFrames =iframeElements.size();
		return numberOfFrames;
	}

	public void switchToFramebyIndex(int i){
		driver.switchTo().frame(i);
		System.out.println("driver switched to frame by index "+ i);
	}

	public void switchToFramebyName(){
		driver.switchTo().frame("guest");
		System.out.println("driver switched to frame by name ");
	}

	public void switchToFramebyWebElement(){
		WebElement webelement=driver.findElement(By.name("cardNumberMask"));
		driver.switchTo().frame(webelement);
	}
	
	public void defaulframeFirstTime(){
		String url="http://www.icicibank.com";
		WebElement returnURL=driver.findElement(By.name("returnUrl"));
		returnURL.sendKeys(url);
		System.out.println("driver in default frame first time and typed text-> "+ url);

	}
	public void actionInSwitchedFrame(){
		String cNumber="123";
		WebElement cardNumber=driver.findElement(By.name("cardSecurityCode"));
		cardNumber.sendKeys(cNumber);
		System.out.println("driver successfully switched to frame and typed text-> "+ cNumber);

	}
	public void defaulframesecondTime(){
		String cssText= "Test case 0001";
		WebElement css=driver.findElement(By.name("customStylesheet"));
		css.sendKeys("Test case 0001");
		System.out.println("driver in default frame second time and typed text ->"+ cssText);
	}
	
	public void closeBrowser(){
		driver.close();
	}
}

