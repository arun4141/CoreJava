package com.rays.oop;

public class TestPoly {
	public static void main(String[] args) {
		
		shape[]s = new shape [3];
		s[0] = new circle(5);
		s[1]= new Triangle(2,6);
		s[2]=new rectangle(2,4);	
		for (int i = 0; i < s.length; i++) {
			s[i].area();
		}
	}

}
