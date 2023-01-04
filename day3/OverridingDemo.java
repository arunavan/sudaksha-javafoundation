package com.tra.day3;
class Ride{
	void sq(int a) {
		System.out.println("Square:"+(a*a));
	}
}
class Mride extends Ride{
	@Override
	void sq(int  b) {
		System.out.println("Perimeter:"+(4*b));
	}
}


public class OverridingDemo extends Mride {
	@Override
	void sq(int a) {
		System.out.println("Volume:"+(a*a*a));
	}
	public static void main(String[] args) {
		Ride r=new Ride();
		r.sq(5);
		r=new Mride();
		r.sq(6);
		r=new OverridingDemo();
		r.sq(6);
		
		Ride r1=new Mride();  // implicit, int to double - reference typecasting
		Mride m1=(Mride)new Ride(); // explicit -double to int  - ecplicit - reference typecasting
		
	}

}
