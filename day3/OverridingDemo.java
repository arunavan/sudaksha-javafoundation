package com.tra.day3;
class Ride{
	void sq(int a) {
		System.out.println("Square:"+(a*a));
	}
}
class Mride extends Ride{
	@Override
	void sq(int a) {
		System.out.println("Perimeter:"+(4*a));
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
		Mride m=new Mride();
		m.sq(6);
		OverridingDemo o=new OverridingDemo();
		o.sq(6);
	}

}
