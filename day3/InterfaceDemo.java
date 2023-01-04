package com.tra.day3;

interface Vehicle{
	void getLoan();
	Integer getTax(Integer amount);
	double speed();
	Integer milage();
	
}
interface Insurance{
	void getPolicy();
}
class Car implements Vehicle,Insurance{
	public void getLoan() {
		System.out.println("gte loan");
	}
	public Integer getTax(Integer amount) {
		return amount/10;
	}
	public double speed() {
		return 90.0;
	}
	public Integer milage() {
		return 20;
	}
	public void getPolicy() {
		System.out.println("insured...");
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		Vehicle v =new Car() ;//=new Vehicle();
		v.getLoan();
		System.out.println(v.getTax(80000));
		System.out.println(v.speed());
		System.out.println(v.milage());

	}

}
