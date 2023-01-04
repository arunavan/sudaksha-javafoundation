package com.tra.day3;

public  class Account {
	private Integer id;
	private String name;
	private Double balance;
	public  Integer getId() {
		return id;	}
	public void setId(Integer id) {
		this.id = id;	}
	public String getName() {
		return name;	}
	public void setName(String name) {
		this.name = name;	}
	public Double getBalance() {
		return balance;	}
	public void setBalance(Double balance) {
		this.balance = balance;	}
	public static void main(String[] args) {
		Account a=new Account();
		a.setId(101);
		a.setName("Ram");
		a.setBalance(60000.00);
		System.out.println(a.getId()+"  "+a.getName()+"  "+a.getBalance());
	}

}
