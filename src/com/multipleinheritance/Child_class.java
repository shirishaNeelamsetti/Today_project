package com.multipleinheritance;

public class Child_class implements Parent_class, Grandpaa_class {
	
	
	public void myclass() {
		System.out.println("hi i am sirisha ");
		
	}
	
	

	public void p1() {
		System.out.println("my papa doesnot drink alchol");
	}

	@Override
	public void p2() {
		System.out.println("my father made me to study btech");
	}

	@Override
	public void p3() {
		System.out.println("my father have 2 daughters");
	}

	@Override
	public void p4() {
		System.out.println("my father gave me gift on my birthday");
	}

	@Override
	public void p5() {
		System.out.println("my father always thinks about our future");
	}

	@Override
	public void gp1() {
		System.out.println("grandpaa is very powerfull");
	}

	@Override
	public void gp2() {
		System.out.println("he is a surpanch of my village");
	}

	@Override
	public void gp3() {
		System.out.println("he has 3 sons");
	}

	@Override
	public void gp4() {
		System.out.println("grandpaa wife name is gouramma");
	}

	@Override
	public void gp5() {
		System.out.println("grandpaa gave 2 accers of land to my father");
	}
	public static void main(String[] args) {
		Child_class c=new Child_class();
		c.gp1();
		c.gp2();
		c.gp3();
		c.gp4();
		c.gp5();
		System.out.println("----------");
		c.p1();
		c.p2();
		c.p3();
		c.p4();
		c.p5();
		System.out.println("-------------");
		c.myclass();
		
	}

}
