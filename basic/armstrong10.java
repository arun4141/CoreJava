package com.raystech.basic;

public class armstrong10 {
	public static void main(String[] args) {
		 int number = 153;
		 int c=0;
		 int sum=0;
		 int r ;
		  c= number;
		  while (c != 0) {
			  r = c  % 10; 
			  sum = sum + r * r * r ; 
			  
			  c=c/10;
		  }
		  if (number == sum) 
		  System.out.println(number + " .is armstrong");
			
		 else {
          System.out.println(number + "is not armstrong");
		}
	}

}
