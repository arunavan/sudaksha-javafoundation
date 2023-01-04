package com.tra.day3;

class Product{
	Integer id;
	String name;
	public Product(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public int hashCode() {
		return this.id.hashCode();
	}
	//Object
	@Override
	public boolean equals(Object o) {
		Product p=(Product)o;
		if( this.id==p.id &&  (this.name).equals(p.name))
			return true;
		else
			return false;
	}
	
}

public class EqualsHashCodeDemo {

	public static void main(String[] args) {
		Product p1=new Product(101,"box");
		Product p2=new Product(101,"box");
		System.out.println(p1==p2);  //check address, hashcode
		System.out.println(p1.equals(p2));
		System.out.println(p1.hashCode()+"  "+p2.hashCode());
		
	}

}
