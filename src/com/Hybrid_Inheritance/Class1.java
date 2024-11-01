package com.Hybrid_Inheritance;

import com.hierarchical.Child1;

class Grandpaa{
	public void gp1() {
		System.out.println("HI HELLO I AM GRANDPAA");
	}
	class Parent extends Grandpaa{
		public void p() {
			System.out.println("hi i am parent");
		}
		
		class Child1 extends Parent{
			public void c1() {
				System.out.println("hi this is child1");
			}
			class child2 extends Parent{
			public void c2() {
				System.out.println("hi this is child2");
			}
			}
		}
	}
}



public class Class1 {
	public static void main(String[] args) {
		Child1 	c1=new Child1();
		//c1.
		
		
	}

}
