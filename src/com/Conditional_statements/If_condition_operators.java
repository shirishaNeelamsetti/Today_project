package com.Conditional_statements;

public class If_condition_operators {

	public static void main(String[] args) {
		
		int a = 100;
		int b = 200;
		int c = 300;
		int d = 400;
		
		if((a>b)&&(b<c)) {
			System.out.println(" condition1,d value is high ");
		}
		else if((c<b)||(b>c)) {
			System.out.println("condition2, d value is high");
			
		}
		else if((d<c)&&(c>a)||(b<a)) {
			System.out.println("condition 3,d value is high");
			
		}
		else if((a<c)&&(b<d)||(c>b)&&(d>a)) {
			System.out.println("condition 4 ,d value is high");
		}
		else {
			System.out.println("condition 5, da value is high");
		}
		
		
		

	}

}
