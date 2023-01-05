package com.tra.day4;

class Bank{
	
	Integer id; //instanc evariable object level
	String name;
	static String city="Hyderabad"; // class level, 
	
	static void disp() {
		System.out.println("static function");
	}
}

public class Staticdemo {
	{
		System.out.println("instance block called before each constructor");
	}
	Staticdemo(){
		System.out.println("in constructor");
	}
	
	static { //compile time  , before main
		System.out.println("before main static block1===once");
		
	}
	static String country="India";
	static void disp1() {
		System.out.println("static function1");
	}
	static { //compile time  , before main
		System.out.println("before main static block2===once");
		
	}
	public static void main(String[] args) {
		System.out.println("main started ");
		Bank b1=new Bank();
		Bank b2=new Bank();
		b1.id=101;
		b2.id=102;
		System.out.println(b1.id+"  "+b1.city);
		System.out.println(b2.id+"  "+b2.city);
		System.out.println(Bank.city);
		System.out.println(country);
		b1.disp();
		Bank.disp();
		b2.disp();
		disp1();
		Staticdemo s1=new Staticdemo();
		Staticdemo s2=new Staticdemo();
		Staticdemo s3=new Staticdemo();
	}

}
