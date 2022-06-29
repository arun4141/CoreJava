package com.rays.oop;

public class Triangle extends shape {
	private int height;
	private int base ;
	
	public Triangle () {
		
	}
	public Triangle (int h, int b) {
		height = h ;
		base = b;
	}

	public void area () {
		double area = 0.5*height*base;
		
		System.out.println(area);
		
	}
}
