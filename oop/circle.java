package com.rays.oop;

public class circle extends shape {
	
	private int radius ;
	
	public circle() {}

	public circle(int r) {
		radius = r; 
	}
	 
	public void area () {
		double area = shape.pi*radius*radius ;
		System.out.println(area);
	}
	

}
