package com.demo.testNG.Random;

import org.testng.annotations.Test;

public class MultipleTimeRunTestNG {
	int i=0;
	
	@Test(invocationCount=5,groups={"TestNG","demo","TC005","invocationCount"})
	public void runMultipleTimes(){
		i++;
		System.out.println("run this test multiple time & counter is "+i);
        System.out.println("Thread Id: "+Thread.currentThread().getId());
	}
}


