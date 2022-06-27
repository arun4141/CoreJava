package com.rays.oop;

public class testconstructor {
	public static void main(String[] args) {
		
		constructor c = new constructor("arun", "indore", 10, "red") ;
		 System.out.println(c.getAddress());
		 System.out.println(c.getColur());
		 System.out.println(c.getName());
		 System.out.println(c.getNumber());
	}

}
