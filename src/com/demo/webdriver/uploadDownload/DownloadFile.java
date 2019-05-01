package com.demo.webdriver.uploadDownload;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DownloadFile {

	public static void main(String[] args) throws InterruptedException, AWTException {
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("download.default_directory", "C:\\Tosca\\SelDownload");
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		caps.setCapability(ChromeOptions.CAPABILITY, options);
		System.setProperty("webdriver.chrome.driver", "D:\\Grid\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(caps);
		driver.get("http://sample-videos.com/");
		WebElement mp4 = driver.findElement(By.xpath("//a[contains(@class,'active')]"));
		mp4.click();
		WebElement mp4click = driver.findElement(By.xpath("//div[@id='sample-mp4-video']/table/tbody/tr/td[4]/a[contains(@data,126)]"));
		mp4click.click();
		Thread.sleep(3000);
		driver.close();
	}

}