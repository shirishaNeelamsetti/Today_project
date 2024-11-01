package com.scannerclass;

import java.util.Scanner;

public class Scannerclass1 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);//instance creation
		System.out.println("enter your name");
		String name=sc.nextLine();
		System.out.println("enter your roll number");
		int number=sc.nextInt();
		
		System.out.println("my name is--->:"+name);
		System.out.println("my roll number is--->:"+number);
		sc.close();
		
		
		
		

	}

}
