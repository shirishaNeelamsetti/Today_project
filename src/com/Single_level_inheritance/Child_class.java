package com.Single_level_inheritance;

public class Child_class extends Parent_class{


	public static void main(String[] args) {
		father3();
		Child_class cc=new Child_class();
       cc.father();
       cc.father1();
       cc.father2();
       cc.father4();
     String fathers_property=cc.father4();
      System.out.println(fathers_property);
     
	}

}
