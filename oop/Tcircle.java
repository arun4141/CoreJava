package com.rays.oop;

public class Tcircle {
public static void main(String[] args) {
	
	circle c = new circle(5);
	
	
	c.setBorderWidth(4);
	c.setColor("red");
	
	System.out.println(c.getBorderWidth());
	System.out.println(c.getColor());
	
	c.area();
	
}
}
