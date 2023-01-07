package com.tra.day6;

class Course{
	Integer id;
	String name;
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + "]";
	}
	public Course(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
}