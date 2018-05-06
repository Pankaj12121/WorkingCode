package com.demo.testNG.Random;

import org.testng.annotations.Test;

public class RunTimeExceptionInTestNG {

	@Test(expectedExceptions = Exception.class)
	public void withException(){
		int a = 5/0;
		System.out.println(a);
	}


	//This test case will fail-

	@Test()
	public void withoutException(){
		int b = 5/0;
		System.out.println(b);
	}
}

