package com.Abstraction;

import com.Oops.Method_overriding_Child_class;

abstract class parentdetails{
	
	
	abstract void my_phone_lock();//unimplement method
	abstract void  my_account_number();
	abstract void my_atm_pin();
	public void mycollegename() {
		String collegename="bvrit coolege";
		System.out.println("my coolege name is:"+collegename);
	}
	public static void companyname() {
		String comp_name="tcs";
		System.out.println("my office name is:"+comp_name);
	}
}
	
	class Childclass extends parentdetails{

		@Override
		void my_phone_lock() {
			Object lock="123*********";
			
System.out.println("my phone lock number is:"+lock);			
		}

		@Override
		void my_account_number() {
			Object ac_number="20336765*******";
			System.out.println("my account number is:"+ac_number);
			
			
		}

		@Override
		void my_atm_pin() {
			Object Atm_pin="12**";
			System.out.println("MY ATM PIN IS:"+Atm_pin);
			
		}
		
	}
		


public class Abstract_Class {

	public static void main(String[] args) {
		
		parentdetails p=new Childclass();
		p.my_phone_lock();
		p.my_atm_pin();
		p.my_account_number();
		p.companyname();
		p.mycollegename();
		
		
		
		

	}

}
