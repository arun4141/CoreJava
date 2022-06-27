package com.rays.oop;

public class testaccount {
	
	
	     private  String number = null ;
	       
	     private  String accounttype = null ;
	     
	     private  double balance = 0 ;
	     
	     
	     
	     

		public String getNumber() {
			return number;
		}

		public void setNumber(String number) {
			this.number = number;
		}

		public String getAccounttype() {
			return accounttype;
		}

		public void setAccounttype(String accounttype) {
			this.accounttype = accounttype;
		}

		public double getBalance() {
			return balance;
		}

		public void setBalance(double balance) {
			this.balance = balance;
		}
	     public void deposite (int b) {
	    	 balance = balance + b ;  
	    	 }
	     
	     public void withdrawal (int w) {
	    	 balance = balance - w ;
	    	 
	     }
	     public void paybill (int k) {
	    	 balance = balance - k ;
	     }
	     public void fundTransfer (int t) {
	    	 balance = balance - t ;
	     }
	    
	     }
	     
	       
	       


