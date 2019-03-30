package com.adv.dataTypes;

public class DataTypes {
	
	public static void main(String args[])  
    { 
		
		//***********************boolean*************************
        boolean b = true;        
        if (b == true) 
            System.out.println("Hi Geek"); 
        
        //**********************byte********************************
        
        byte a = 126; 
        
        // byte is 8 bit value 
        System.out.println(a); 
         
        a++; 
        System.out.println(a); 
          
        // It overflows here because 
        // byte can hold values from -128 to 127 
        a++; 
        System.out.println(a); 
          
        // Looping back within the range 
        a++; 
        System.out.println(a); 
        
        char seven='M';
        System.out.println(seven);
        char character2 ='A';
        for (int i=0;i<=26;i++) {
        char character1 ;
        
        character1  =character2 ;
        System.out.println("ch1 contains " + character1 );
        character1++; // increment character1
        character2=character1;
        System.out.println("ch1 is now " + character1 );
        }
    }     

}
