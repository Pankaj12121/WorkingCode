package com.demo.oops.encapsulations;

import java.util.HashMap;

public class Test {
	
	public static void main(String[] args) {
		
	
	
	HashMap<Integer, String> test12= new HashMap<Integer, String>();
	
	test12.put(0, "pankaj");
	test12.put(0, "pankaj1");
	test12.put(1, "shrikant");
	test12.put(1, "shrikant1");
	test12.put(2, "yogi");
	test12.put(2, "yogi2");
	
	for(String test :test12.values()){
		
		System.out.println(test);
		
	}

}
}