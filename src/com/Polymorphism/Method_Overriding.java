package com.Polymorphism;


class fam_members {
	public void father() {
		System.out.println("my father works as a driver");
	}

	public void mother() {
		System.out.println("my mother stiches dresses");
	}

	public void sister() {
		System.out.println("my sister is an intellegent girl ");
	}

	public void siri() {
		System.out.println("i love to read novels");
	}
}

class famliy extends fam_members{
	public void father() {
		System.out.println("father take care of family members");
	}
	public void siri() {
		System.out.println("shirisha like to drive");
		super.siri();
	}
}

public class Method_Overriding {

	public static void main(String[] args) {
		famliy f=new famliy();
		f.father();
		f.siri();
		fam_members fm=new fam_members();
		fm.father();
		
		
		
		
	}

}
