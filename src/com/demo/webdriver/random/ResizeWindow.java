package com.demo.webdriver.random;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ResizeWindow {
	    public static void main(String[] args) {
	    	System.setProperty("webdriver.gecko.driver","\\Grid\\geckodriver.exe");
	        WebDriver driver = new FirefoxDriver();
	        driver.manage().window().setSize(new Dimension(400,600));
	    }
	}


