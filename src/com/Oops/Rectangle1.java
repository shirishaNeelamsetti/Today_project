package com.Oops;

public class Rectangle1 {

	private int length, width;

	private Rectangle1() {
		length = 30;
		width = 40;
	}

	public Rectangle1(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public void area() {
		System.out.println("area of rectangle :" + (length * width));
	}

	public static void main(String[] args) {
		Rectangle1 r = new Rectangle1();
		r.area();
	}

}
