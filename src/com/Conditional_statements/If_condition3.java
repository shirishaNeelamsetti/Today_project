package com.Conditional_statements;

public class If_condition3 {

	public static void main(String[] args) {
		int a= 30;
		int b= 20;
		int c= 10;
		
		
		if ((a < b) && (a < c)){
		System.out.println("smaller value is: "+a);
		}
		else if (b < c){
			System.out.println("smaller value is: "+b);
		}
		else{
			System.out.println("Smaller value is: "+c);
		}



	}

}
