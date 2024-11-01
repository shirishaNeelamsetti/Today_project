package com.Oops;

public class Constructor_overloading {

//	constructor overloading:
//		sometimes a class can have more than one Constructor is 
//	called Constructor overloading
//		constructors can be differ based on argument list, like
//			-number of Arguments
//			-data type of arguments
//			-sequence of Data type of arguments
//
	 public Constructor_overloading(int a, int b) {
		int c = a * b;
		System.out.println("multiplication of given values is: " + c);
	}

	public Constructor_overloading(String x, String y) {
		String z = x + y;
		System.out.println(z);
	}

	public static void main(String[] args) {
		Constructor_overloading co = new Constructor_overloading(5, 5);
		Constructor_overloading co2 = new Constructor_overloading("sisrisha", "developper");
	}

}
