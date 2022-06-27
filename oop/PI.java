package com.rays.oop;

import java.util.Date;

public class PI {
	
	private String name ;
	private String accounttype;
	private String number;
    private double balance ;
    private Date dob;
    
    public static final int age = 22 ; 
    
	

	
	public PI() {
    	System.out.println();
    	
    	
    }
    
	public PI(String name, String accounttype, String number, double balance, Date d) {
		
		this.name = name;
		this.accounttype = accounttype;
		this.number = number;
		this.balance = balance;
		dob = d;
	}

	public String getName() {
		return name;
	}

	public String getAccounttype() {
		return accounttype;
	}

	public String getNumber() {
		return number;
	}

	public double getBalance() {
		return balance;
	}
	
	public Date getDob() {
			return dob;
	}

	
	public void withdrawl (int w) {
   	 balance = balance - w ;
	}
	public void deposit (int d) {
		balance = balance + d ;
		}
	
	public void paybill (int P) {
   	 balance = balance - P ;
    }
    
	public void fundTransfer (int F) {
   	 balance = balance - F ;

    }
	
	
}
