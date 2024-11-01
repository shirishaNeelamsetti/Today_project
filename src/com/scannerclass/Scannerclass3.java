package com.scannerclass;

import java.util.Scanner;

public class Scannerclass3 {

	public static void main(String[] args) {
		String name1 = "neelamsetti";
		String name2 = "sirisha";

		Scanner sc = new Scanner(System.in);
		System.out.println("enter your first name");
		name1 = sc.nextLine();
		System.out.println("enter your second name");
		name2 = sc.nextLine();
		System.out.println("adding of two strings:" + name1.concat(name2));

	}

}
