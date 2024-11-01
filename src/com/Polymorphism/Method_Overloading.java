package com.Polymorphism;

class water{
	public void water123(String season,Object a) {
		
		season="summer";
		a="90 deg temp";
		
		System.out.println(season+"season water is"+a);
		}
	
	public void water123(String season,String b) {
		season="winter";
		b="30 deg temp will get freez";
		System.out.println(season+"season water gets"+b);
		
		
	}
	public void water123(String season,int c) {
	
	
		System.out.println(season+"season water gets evapurated in"+c+"degrees");
		
	}
	
}
public class Method_Overloading {

	public static void main(String[] args) {
		water met_over_loading=new water();
		met_over_loading.water123(null, met_over_loading);
		met_over_loading.water123(null, met_over_loading);
		met_over_loading.water123("rainy", 100);
		
		

	}

}
