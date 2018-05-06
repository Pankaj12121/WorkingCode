package com.demo.superkeyword.classmethod;

public class Dog extends Animal{
	void eat(){
		System.out.println("eating bread...");
	}  
	void bark(){
		System.out.println("barking...");
	}  
	void work(){  
		super.eat();  
		bark();  
	}  

}
