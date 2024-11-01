package com.Oops;

public class MethodOverloading {
	int result11;
	static String result1;
	boolean result;
	long output;

	public void add(int a, int b) {
		this.result11 = a + b;
		System.out.println("adding of two numbers are :" + result11);
	}

	public void add(String x, String y) {
		this.result1 = x.concat(y);
		System.out.println("concat of two strings are :" + result1);
	}

	public void add(boolean a, boolean b) {
		a = true;
		b = true;
		this.result = (a && b);
		System.out.println("a and b boolean functions are :" + result);
	}

	public void add(Object a, Object b) {
		a = "shirisha";
		b = 22;
		System.out.println("my name is :" + a + "my age is :" + b);
	}

	public void add(long s, long y, long u) {
		s = 123456;
		y = 234567;
		u = s + y;
		long u1 = 987654;
		this.output = u1 + u;
		System.out.println("long values are :" + output);
	}

	public static void main(String[] args) {
		MethodOverloading mo = new MethodOverloading();
		mo.add(10, 20);
		mo.add(args, mo);
		mo.add(false, false);
		mo.add("sirisha", "neelamsetti");
		mo.add(0, 0, 0);
	}

}
