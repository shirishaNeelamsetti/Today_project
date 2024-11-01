package com.non_primitivedatatype;

public class Equalignorecase {

	public static void main(String[] args) {
		
		String language1="java";
		String language2="JAVA";
		System.out.println(language1.equals(language2));
		System.out.println(language1.equalsIgnoreCase(language2));
		System.out.println(language1.equalsIgnoreCase("JAVA"));
		
	}

}
