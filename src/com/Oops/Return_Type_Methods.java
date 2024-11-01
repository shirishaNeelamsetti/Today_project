package com.Oops;

public class Return_Type_Methods {

	int result;
	static String result1;

	public int add(int a, int b) {
		result = a + b;
		return result;
	}

	public String add1(String x, String y) {
		result1 = x.concat(y);
		return result1;
	}

	public int multiplication() {
		int c = 10;
		int d = 20;
		this.result = c * d;
		return result;

	}

	public String namelength() {
		String name = "sirisha";
		return name;
	}

	public static void main(String[] args) {
		Return_Type_Methods rtm = new Return_Type_Methods();

		int output1 = rtm.add(100, 100);
		System.out.println("adding of a and b values are:" + output1);

		String output2 = rtm.add1("sirisha", "neelamsetti");
		System.out.println("concat of two names are:" + output2);

		int output3 = rtm.multiplication();
		System.out.println("c and d multiply values are:" + output3);

		String output4 = rtm.namelength();
		System.out.println(output4.length());

	}

}
