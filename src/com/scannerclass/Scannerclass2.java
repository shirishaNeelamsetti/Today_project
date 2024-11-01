package com.scannerclass;

import java.util.Scanner;

public class Scannerclass2 {

	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		System.out.println("enter your first number");
		int number1=sc1.nextInt();
		System.out.println("enter your second number");
		int number2=sc1.nextInt();
		
		System.out.println("the sum of two numbers is:"+(number1+number2));
		

	}

}
