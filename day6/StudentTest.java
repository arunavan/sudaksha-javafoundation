package com.tra.day6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class StudentTest {

	public static void main(String[] args) {
		
		TreeSet ts=new TreeSet();
		Student s1=new Student(1,"Ram",14);
		Student s2=new Student(10,"Arun",9);
		Student s3=new Student(6,"Sai",19);
		Student s4=new Student(7,"Bindu",15);
		Student s5=new Student(2,"Kiran",12);
		ArrayList a=new ArrayList();
		a.add(s1);
		a.add(s2);
		a.add(s3);
		a.add(s4);
		a.add(s5);
		System.out.println(a);
		Collections.sort(a);
		//Collections.reverseOrder(a);
		System.out.println(a);
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);
	//	System.out.println(ts);
		
		
		TreeSet ts1=new TreeSet(new SalaryComparator());
		Emp e1=new Emp(34,"kiran",8979.99);
		Emp e2=new Emp(14,"arun",3979.99);
		Emp e3=new Emp(12,"bindu",5979.99);
		ts1.add(e1);
		ts1.add(e2);
		ts1.add(e3);
		System.out.println(ts1);
		
		
		

	}

}
