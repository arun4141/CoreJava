package com.raystech.basic;

public class dayswitch {
	public static void main(String[] args) {
		 
		int day = 7 ;
	 String dayString = null;
	 
	 switch (day) {
	  
	  case 0 :
	         dayString = "sunday";
	         break ;
	 
	  case 1 :
			 dayString = "monday";
			 break ;
	  case 2 :
		 dayString = "tuesday";
			 break ;
	  case 3 :
			 dayString = "wednesday";
			 break ;
	  case 4 :
			 dayString = "fri";
			 break ;
	  case 5 :
			 dayString = "5";
			 break ;
	  case 6 :
			 dayString = "6";
			 break ;
			 
			 default:
				 dayString = "this day is yet to come" ;
				 }
	 System.out.println(dayString);
	}

}