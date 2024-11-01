package com.Oops;

public class Method_overriding_Child_class extends Method_overriding_parent_class{
	
	
	public void sirisha() {
		System.out.println("i am very dangerous &silent killing person");
	}
	
	public void sirisha2() {
		System.out.println("i am always intrested to reading novels&story teller books");
	}
	
	public void father4() {
		System.out.println("stay clam & take a right decision to talk when we are angry to infron of others");
		super.father4();
	}

	public static void main(String[] args) {
		Method_overriding_Child_class morcc=new Method_overriding_Child_class();
		morcc.father();
		morcc.father1();
		morcc.father2();
		morcc.father3();
		morcc.father4();
		morcc.sirisha();
		morcc.sirisha2();
		Method_overriding_parent_class mopc=new Method_overriding_parent_class();
		System.out.println("------------------------");
		mopc.father4();
																																																																																																																	
		

	}

}
