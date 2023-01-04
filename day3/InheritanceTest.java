package com.tra.day3;

public class InheritanceTest {

	public static void main(String[] args) {
		
		Customer c=new Customer(101,"Ram");
		System.out.println(c);
		c.show();
		OnlineCustomer oc=new OnlineCustomer("Premium","ram@gmail.com");
		System.out.println(oc);
		oc.show();
		oc.disp();
		System.out.println(oc.);
		
	}

}
