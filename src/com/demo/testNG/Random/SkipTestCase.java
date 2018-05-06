package com.demo.testNG.Random;

import org.testng.annotations.Test;

public class SkipTestCase {
	
		@Test                            
		public void defaultEnabled(){
			System.out.println("by default enabled=true");
		}
		@Test(enabled=true)
		public void trueEnabled(){
			System.out.println("hard coded enabled=true");
		}
		@Test(enabled=false)
		public void falseEnabled(){
			System.out.println("this test case will be skipped because enabled=false");
		}
	}




