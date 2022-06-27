package com.rays.oop;

public class taccount {

	public static void main(String[] args) {
		
		testaccount a = new testaccount();
		a.setAccounttype("200078954");
		a.setNumber("9669903218");
		a.setBalance(1000);
		a.deposite(400);
		a.withdrawal(100);
		a.paybill(200);
		a.fundTransfer(0);
		
		
		
		System.out.println(a.getAccounttype());
		System.out.println(a.getBalance());
		System.out.println(a.getNumber());
	
	}
}
