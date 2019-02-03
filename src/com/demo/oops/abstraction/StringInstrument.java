package com.demo.oops.abstraction;

public abstract class StringInstrument extends Instrument{
	
	public StringInstrument() {
		System.out.println("I am in to abstract class");
	}
	public StringInstrument(String x) {
		System.out.println("I am in to abstract class for X variable");
	}
	
	
	protected int numberOfStrings;

}
