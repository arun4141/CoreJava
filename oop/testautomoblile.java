package com.rays.oop;

public class testautomoblile {
	
	
	private String color ;

	private int speed ;
	
	private String make ;
	
	private int gear;

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}
	public void changGear() {
	
		if (getSpeed()== 10) {
			System.out.println("Gear = "+ 1);
			
		}
		if (getSpeed()== 20) {
			System.out.println("Gear = "+ 2);
		}
		if (getSpeed()== 50) {
			System.out.println("Gear = "+ 3);
			
		}
		if (getSpeed()== 60) {
			System.out.println("Gear = "+ 4);
			
		}
		if (getSpeed()== 120) {
			System.out.println("Gear = "+ 5);
		
		}
	
	}
	public void breakk() {
		if (getSpeed()>50) {
			System.out.println("breakk!!!!");
			
		} {
			
		}
	}
	
	
	
	
	
}
