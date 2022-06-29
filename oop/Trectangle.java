package com.rays.oop;

public class Trectangle {
	public static void main(String[] args) {
		
		shape s = new rectangle(8,9);
		
		s.setBorderWidth(8);
		s.setColor("blue");
		
		System.out.println(s.getBorderWidth());
		System.out.println(s.getColor());
		s.area();
		
	}

}
