package com.tra.day3;
//asbtract class cannot be instantiated, object cnanot be created
// contains 1 or more abstract methods
//method without body is abstract method
abstract class Loan1{
	  abstract  Integer getEmt(Integer amount); //abstract method
	  abstract Double calculateInterest(Double principle); //abstract method
	  void show() {
		  System.out.println("concrete method...");
	  }
}
abstract class Parking{
	abstract void getParkingSlot();
}
//all abstract methods must be implemented, concrete method is optional
class HousingLoan extends Loan1{
	Integer getEmt(Integer amount) {
		
		return amount/12;
	}
	Double calculateInterest(Double principle) {
		return principle*10/5.0;
	}
}
class VehicleLoan extends Loan1{
	Integer getEmt(Integer amount) {
		
		return amount/6;
	}
	Double calculateInterest(Double principle) {
		return principle*12/5.0;
	}
}

public class AbstractDemo {

	public static void main(String[] args) {
		Loan1 l=new HousingLoan();//=new Loan();
		System.out.println(l.calculateInterest(89000.00));
		System.out.println(l.getEmt(9000));
		l.show();
		l=new VehicleLoan();
		l.show();
		System.out.println(l.calculateInterest(45000.00));
		System.out.println(l.getEmt(9000));
	
		

	}

}
