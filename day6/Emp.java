package com.tra.day6;

public class Emp {
	Integer id;
	String name;
	Double sal;
	public Emp(Integer id, String name, Double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	

}
