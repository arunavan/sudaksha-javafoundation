package com.tra.day4;
//final
//final class cannot be inherited
//final 
class Demo{
	
	//final method cannot be overriden
	void area(int s) {
		System.out.println(s*s);
	}
	
}
class SubDemo extends Demo
{ @Override
  void area(int s) {
		System.out.println(s*s*s);
	}
}

public class Finaldemo {
	//final   varibale cannot be modified
	int x=10;
	void show() {
		System.out.println(++x);
	}

	public static void main(String[] args) {
		Finaldemo f=new Finaldemo();
		f.show();
		SubDemo s=new SubDemo();
		s.area(4);

	}

}
