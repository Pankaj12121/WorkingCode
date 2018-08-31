package com.demo.oops.abstraction;

import org.openqa.selenium.WebElement;

public abstract class Instrument {

	protected String name;

	abstract public void play();
	
	protected void click(WebElement element){
		
		System.out.println();
	}

}
