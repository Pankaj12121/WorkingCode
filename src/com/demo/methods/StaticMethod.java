 package com.demo.methods;

public class StaticMethod {

	public static double totalLength(String a, String b) {
		return a.length() + b.length();
	}

	public static double averageLength(String a, String b) {
		return totalLength(a, b) / 2;
	}

	public static void main(String[] args) {
		
		double total = totalLength("Golden", "Bowl");
		double average = averageLength("Golden", "Bowl");

		System.out.println(total);
		System.out.println(average);
	

}
}
