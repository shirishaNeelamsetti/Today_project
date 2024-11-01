package com.Conditional_statements;

import java.util.Scanner;

public class Interview_related3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the abc values");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a==b && b==c) {
			System.out.println("all numbers are equal");
		}
		else if(a>b) {
			System.out.println("a is greterthan b ");
		}
		else if( b>c) {
			System.out.println("b is greterthan c");
		}
		else {
			System.out.println("c is greterthan");
		}

	}

}
