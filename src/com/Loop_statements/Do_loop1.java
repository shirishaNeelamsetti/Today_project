package com.Loop_statements;

public class Do_loop1 {

	public static void main(String[] args) {

//Ex-2: Write program to print from 1 to 5, but if value 3 displayed then  do-while loop should terminate

	int n=1;
		
	do {
	    System.out.println(n);
		if(n==3){
		break;//to remove the iterations
		}
		n++;
	}while (n <= 5);

	}

}
