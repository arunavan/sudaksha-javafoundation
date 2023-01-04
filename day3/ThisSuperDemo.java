package com.tra.day3;
class Loan{
	 int id;
	 String bankName;
	 Loan(){
		 id=10;
		 bankName="ICICI";
		 System.out.println("Parent");
		 System.out.println(id +"  "+bankName);
	 }
	 
	 
	public Loan(int id) {
		super();
		this.id = id;
	}


	public Loan(int id, String bankName) {
		this();
		//this(234);
	//	this.id = id;
	//	this.bankName = bankName;
		System.out.println(this.id+"  "+this.bankName);
	}
	void show() {
		System.out.println(" parent show ");
	}
	 
	
}

class PersonalLoan extends Loan {
	int id;
	PersonalLoan(){
		super(11,"AXIS");
		id=20;
		System.out.println("Child");
	}
	
	void show() {
		System.out.println(" in child show");
		System.out.println(this.id +"  "+ super.id);
	}
	void disp() {
		System.out.println("in disp...");
		this.show();
		super.show();
	}
}
public class ThisSuperDemo {

	public static void main(String[] args) {
		PersonalLoan p=new PersonalLoan();
		p.show();
		p.disp();
		Loan l=new Loan(1020,"HDFC");

	}

}
