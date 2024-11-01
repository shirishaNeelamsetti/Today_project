package com.increment_decrement;

public class Post_inc_dec {
	
public static void main(String[] args) {
	
	int a=5;
	System.out.println(a);//5
	a++;
	System.out.println(a);//6
	System.out.println("-------------------------");
	
	//post increment
	int s=a;
	System.out.println(s);//6
	System.out.println(a);//6
	int m=s++;
	System.out.println(m);//6
	System.out.println(s);//7
	
	int x=m++;
	System.out.println(x);//6
	System.out.println(m);//7
	System.out.println(s);//7
	
	System.out.println("-----------------------------");
	
	//post decrement
	
	x--;
	System.out.println(x);//5
	
	int z=s--;
	System.out.println(z);//7
	System.out.println(s);//6
	s--;
	
	
	int k=a--;
	System.out.println(a);//5
	System.out.println(k);//6
	System.out.println(s);//5
	
	
	
}

}
