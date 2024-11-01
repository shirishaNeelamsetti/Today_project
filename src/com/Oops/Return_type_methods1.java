package com.Oops;

import java.util.Scanner;

public class Return_type_methods1 {
	int console;

	public int addition() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a and b values");
		int a1 = sc.nextInt(), b1 = sc.nextInt();
		console = a1 + b1;
		return console;

	}

	public static void main(String[] args) {
		Return_type_methods1 rtm = new Return_type_methods1();

		int output = rtm.addition();
		System.out.println("adding of 2 numbers" + output);
	}

}
