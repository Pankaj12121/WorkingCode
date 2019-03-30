
package com.demo.oops.abstraction;

import org.openqa.selenium.WebElement;

public class ElectricGuitar extends StringInstrument{
	WebElement ele;
	public ElectricGuitar() {
		super();
		this.name = "Guitar";
		this.numberOfStrings = 6;
	}
	public ElectricGuitar(int numberOfStrings) {
		super();
		this.name = "Guitar";
		this.numberOfStrings = numberOfStrings;
	}
	@Override
	public void play() {

		System.out.println("An electric " + numberOfStrings + "-string " + name
				+ " is rocking!");
	}
}
