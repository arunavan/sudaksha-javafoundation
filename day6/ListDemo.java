package com.tra.day6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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

public class ListDemo {

	public static void main(String[] args) {
		
		//Course courses[]=new Course[5]; //fixed size, array of objects, static , does not support sear,sort
		/*
		 * courses[0]=new Course(10,"java"); courses[1]=new Course(11,"j2ee");
		 * courses[2]=new Course(12,"oracle"); courses[3]=new Course(13,"spring");
		 * courses[4]=new Course(14,"hibernate");
		 * 
		 * for(Course c: courses) System.out.println(c.id+"  "+c.name);
		 */
		
		List courselist=new ArrayList(); //dynamic, insert,delete,search,sort...
		courselist.add(new Course(10,"java"));
		courselist.add(new Course(11,"php"));
		courselist.add(new Course(12,"php"));
		courselist.add(new Course(13,"php"));
		courselist.add(new Course(14,"php"));
		courselist.add(234);
		courselist.add("java");
		courselist.add("java2");
		courselist.add("java3");
		courselist.add("java4");
		
		System.out.println(courselist);
		courselist.remove(2);
		courselist.remove("java2");
		System.out.println(courselist.size());
	//	courselist.clear();
		//System.out.println(courselist.isEmpty());
		System.out.println(courselist);
		System.out.println(courselist.indexOf("java3"));
		System.out.println(courselist.contains("java4"));
		
		ArrayList l2=new ArrayList();
		l2.add(20);
		l2.add(30);
		l2.add(40);
		System.out.println(courselist);
	//	courselist.addAll(l2); //1
		System.out.println(courselist);
		System.out.println(courselist.containsAll(l2)); //2
	//	courselist.removeAll(l2); //3
	//	courselist.retainAll(l2); //4
		System.out.println(courselist);
		
		System.out.println(" for each..........");
		for (Object b:courselist)
		System.out.println(b);
		System.out.println(" using iterator....");
		Iterator i=courselist.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		
		
	}
}
