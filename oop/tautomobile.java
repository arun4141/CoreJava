package com.rays.oop;

public class tautomobile {
	public static void main(String[] args) {
		
		testautomoblile a = new testautomoblile () ;
		a.setColor("red");
		a.setMake("dsdsdd");
		a.setSpeed(1009);
		a.setGear(5);
		
		
		System.out.println(a.getColor());
		System.out.println(a.getMake());
		System.out.println(a.getSpeed());
		
		a.changGear();
		a.breakk();
	}

}
