package com.demo.constructors;

public class ConstructorChaining {
	public ConstructorChaining(){
        System.out.println("In default constructor...");
    }
    public ConstructorChaining(int i){
        this();
        System.out.println("In single parameter constructor...");
    }
    public ConstructorChaining(int i,int j){
        this(j);
        System.out.println("In double parameter constructor...");
    }
     
    public static void main(String a[]){
    	ConstructorChaining ch = new ConstructorChaining(10,20);
    	System.out.println(ch);
    }

}
