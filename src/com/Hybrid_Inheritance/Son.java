package com.Hybrid_Inheritance;

public class Son  extends Parent1{
public void s() {
	System.out.println("my name is sandeep");
}
	public static void main(String[] args) {
		Son s=new Son();
		s.gp2();
		s.p1();
		s.s();
	}

}
