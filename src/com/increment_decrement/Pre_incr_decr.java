package com.increment_decrement;

public class Pre_incr_decr {

	public static void main(String[] args) {
		int m = 100;
		System.out.println(m);//100
		m++;
		System.out.println(m);//101
		
		//pre_incremnt
		++m;
		System.out.println(m);//102
		int s=++m;
		System.out.println(s);//103
		++s;
		System.out.println(s);//104
		System.out.println(m);//103
		
		//pre decrement
		--s;
		System.out.println(s);//103
		int x=--s;
		System.out.println(x);//102
		System.out.println(s);//102
		--s;
		System.out.println(s);//101
		

	}

}
