package com.demo.flowcontrol;

public class SwitchStatement {
	public enum days{monday,tuesday}
	public static void main(String[] args) {
		
		for (int i = 0; i <= 4; i++) {
			// Switch on number.
			switch (i) {
			case 1: {
				System.out.println("One: " + i);
			break;
			}
			case 2:{
				System.out.println("Two: " + i);
			}
<<<<<<< HEAD
=======
			case 2:
				//break;
>>>>>>> d38b64bf09683a98e4f74db7323d39b95b40d241
			case 3: {
				System.out.println("Two or three: " + i);
			break;	
			}
			default: {
				System.out.println("Default case: " + i);
			}
			}
		}

	}
}
