package com.tra.day3;

class OnlineCustomer extends Customer { //sub class, derived class
	String type; //
	String email;
	public OnlineCustomer(String type, String email) {
		//super();
		super(102,"rajiv");
		this.type = type;
		this.email = email;
		
	}
	@Override
	public String toString() {
		return "OnlineCustomer [type=" + super.id+ "  "+super.name +"  "+ type + ", email=" + email + "]";
	}
	
	void disp() {
		System.out.println("child");
	}
	
	
}
