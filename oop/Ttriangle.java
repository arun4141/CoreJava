package com.rays.oop;

public class TTriangle  {
	
	public static void main(String[] args) {
		
		Triangle t = new Triangle(5, 2);
		
		t.setBorderWidth(5);
		t.setColor("red");
		
		System.out.println(t.getBorderWidth());
		System.out.println(t.getColor());
		
		t.area();
		
	}

}
