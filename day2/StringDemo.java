package com.tra.day2;

public class StringDemo {

	public static void main(String[] args) {
		String s=new String("sudaksha");// object , immutable
		System.out.println(s.hashCode());
		String s1="india";  //literal or string constant
		
		System.out.println(s.toUpperCase().hashCode());  //1 
		System.out.println(s.toLowerCase().hashCode()); //1
		System.out.println(s.concat("Technologies").hashCode());//1
		System.out.println(s.hashCode());
		System.out.println(s.length());
		System.out.println(s.charAt(2));
		System.out.println(s.lastIndexOf("a"));
		System.out.println(s.compareTo("rudaksha")); // <0 -,> //0 ,>0 +,
		String ss="java";
		//builtin synchronized, slow
		StringBuffer sb=new StringBuffer(ss);//mutable, will not create objects
		System.out.println(sb.hashCode());
		System.out.println(sb.append("Technologies").hashCode());
		System.out.println(sb.insert(3,"pv"));
		System.out.println(sb.delete(2, 5));
		System.out.println(sb.delete(2, 5));
		
		System.out.println(sb.reverse());
		System.out.println(sb.capacity());
		sb.ensureCapacity(100);
		System.out.println(sb.capacity());
		//not synchronized, faster than stringbuffer
		StringBuilder sb1=new StringBuilder(ss);//mutable, will not create objects
		System.out.println(sb1.hashCode());
		System.out.println(sb1.append("Technologies").hashCode());
		System.out.println(sb1.insert(3,"pv"));
		System.out.println(sb1.delete(2, 5));
		System.out.println(sb1.delete(2, 5));
		
		System.out.println(sb1.reverse());
		System.out.println(sb1.capacity());
		sb1.ensureCapacity(100);
		System.out.println(sb1.capacity());
		
		
	}

}
