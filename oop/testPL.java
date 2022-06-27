package com.rays.oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.text.PlainDocument;

public class testPL {
	 public static void main(String[] args) throws ParseException {
		
		 SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		String s = "23/07/2000";
		Date j = sdf.parse(s);
		
		
				 
		
		 PI P = new PI("Arun", "379858658522" , "9669903218", 1000, j) ;
		
		 P.deposit(5000);
		 P.withdrawl(2000);
		 P.paybill(200);
		 P.fundTransfer(300);
		System.out.println(PI.age);		 
		
		 
		 System.out.println("balance = " + P.getBalance());
		 System.out.println("name = " + P.getName());
		 System.out.println("Accountname = " + P.getAccounttype());
		 System.out.println("Phonenumber = " + P.getNumber());
		 System.out.println(P.getDob());
	 
	//* System.out.println("deposit = " + P.getBalance());
     
    //* System.out.println("with = " + P.getBalance());
    
   //* System.out.println("paybill = " + P.getBalance());
   
  //*  System.out.println("fundTransfer = " + P.getBalance());
		 
		 
	      
	      
	      
		 
		}
			
	 
		
	}


