package com.tra.day3;

public class Customer {
	public Integer id;
	 public String name;
	public  Customer() {
		 
	 }
	public Customer(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}
	
	
	 void show() {
		System.out.println("parent");
	}
	 

}


