package com.Oops;

public class This_keyword {
//	sometimes we may have variable with same name in class level and method level
//	in that case to specify class level variable in method we use "this" keyword
//		syntax:
//		this.variablename
//

	
	int result;//class variable
	
	//to perform multiplication
	public String multiply(int x, int y) {
		int a = x;
		int result= y;
		this.result = a * result;
		return("Multiplicatio of given numbers is: "+this.result);
	}

public static void main(String[] args) {
	This_keyword  tk = new This_keyword();
	
	String x= tk.multiply(5,9);
	System.out.println(x);

}

}


	
	
	

