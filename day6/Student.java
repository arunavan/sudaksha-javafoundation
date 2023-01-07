package com.tra.day6;

public class Student implements Comparable{
	Integer id;
	String name;
	Integer age;
	
	public int compareTo(Object o) {
		Student s=(Student)o;
		/*
		 * if( this.id>s.id) return 1; else if (this.id<s.id) return -1; else return 0;
		 */
		
		//return this.name.compareTo(s.name);
		
		if(this.age>s.age)
			return 1;
		else
			if(this.age<s.age)
				return -1;
		else
			return 0;
	}
	
	public Student(Integer id, String name, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	

}
