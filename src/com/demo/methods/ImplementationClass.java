package com.demo.methods;

public class ImplementationClass{
/*****************************************privateMethod****************************************************************/	
	public static void main(String[] args) {
		PrivateMethods privateM= new PrivateMethods();
		privateM.apply();
		//privateM.Validate()--we can not call private methods outside the class
		
	
	/*****************************************protectedMethod****************************************************************/		
		ProtectedMethod protMethod= new ProtectedMethod();
		//protMethod.userNameDisplay();....we can not access it in normal classes
		
	/******************************************StaticMethod*********************************************************************/
		ReturnMethods.main(args);
		
		StaticMethod st = new StaticMethod();
		st.averageLength("Ferdous", "Amin");
		st.totalLength("Pankaj", "Yogi");
		
		
		
	}
}
