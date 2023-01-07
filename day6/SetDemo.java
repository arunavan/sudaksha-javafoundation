package com.tra.day6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		//ArrayList l=new ArrayList(); // ordere or insertion  and duplicates allowed
		//HashSet l=new LinkedHashSet(); // orderd, uniques set, index based operations are not allowed
	//Set l=new HashSet();//not sorted, not ordered
		Set l=new TreeSet(); //not orderd, uniques set, index based operations are not allowed
		//indexOf,remove,add is not possible
		//auto sort
		l.add(34);
		l.add(23);
		l.add(6);
		l.add(7);
		//l.add(5,89);
		l.add(67);
		l.add(34);
		l.add(23);
		//l.remove(34);
		System.out.println(l);
		System.out.println(l.contains(23));
		System.out.println(l.size());
		Iterator i=l.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		HashSet<Course> h=new HashSet<>();
		h.add(new Course(10,"java"));
		h.add(new Course(10,"java"));
		System.out.println(h);
		}
}
