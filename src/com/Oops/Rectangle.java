package com.Oops;

public class Rectangle {
	
	private int length,width;
	
	public Rectangle() {
		length=20;
		width=30;
	}
	
	public void area() {
		System.out.println("area of rectangle : "+(length*width));
	}
	
	public static void main(String[] args) {
		Rectangle r=new Rectangle();
		r.area();
	}

}
