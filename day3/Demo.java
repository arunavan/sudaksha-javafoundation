package com.tra.day3;

public class Demo {  //non sub class

	public static void main(String[] args) {
		Account a=new Account();
		a.setId(106);
		System.out.println(a.getId());
		Customer c=new Customer(101,"Ram");
		c.show();
	}

}
