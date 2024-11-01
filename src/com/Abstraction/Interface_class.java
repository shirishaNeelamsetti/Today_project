package com.Abstraction;

interface places {
	public void tirupathi();

	public void hyderabad();

	public void vizag();

	public void srikakulam();

	public void bangalore();

	public void palakollu();
}

class Getdata implements places {

	@Override
	public void tirupathi() {
		String t = "venkateswara swamy temple";
		String t1 = "alipirimetlu";
		System.out.println("my fvrt god is:" + t);
		System.out.println("we need to climb :" + t1 + " to reach:" + t);
	}

	@Override
	public void hyderabad() {
		String h = "charminar";
		String h1 = "Golkonda fort";
		System.out.println(h + "is famous in hyd");
		System.out.println("bonalu will be celebrated in:" + h1);
	}

	@Override
	public void vizag() {
		String v = "Rk beach";
		String v1 = "Rushi konda";
		System.out.println(v + "famous for beach_lovers");
		System.out.println("from" + v1 + "we can view full city");
	}

	@Override
	public void srikakulam() {
		String s = "pedhamagudi";
		System.out.println("wishes will be come true in:" + s);

	}

	@Override
	public void bangalore() {
		String b = "nadhi hills";
		System.out.println("bangalore fvrt palce is:" + b);

	}

	@Override
	public void palakollu() {
		String p = "shiva";
		System.out.println("pkl fvrt temple is:" + p);

	}

}

public class Interface_class {

	public static void main(String[] args) {
		places p = new Getdata();
		p.bangalore();
		p.hyderabad();
		p.tirupathi();
		p.vizag();
		p.palakollu();

	}

}
