package com.demo.webdriver.random;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ProxySetUP {

	public static void main(String[] args) {

		//Create proxy class object
		Proxy p=new Proxy();
		// Set HTTP Port to 7777
		p.setHttpProxy("localhost:7777");
		// Create desired Capability object
		DesiredCapabilities cap=new DesiredCapabilities();
		// Pass proxy object p
		cap.setCapability(CapabilityType.PROXY, p);
		// Open  firefox browser
		WebDriver driver=new FirefoxDriver(cap);
		// from here onwards code will be same as normal script

	}


}


