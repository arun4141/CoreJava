package Inheritance.shape.oop.abstrac;



public class Cricle extends shape {
	
	private int radius ;
	
	public Cricle() {
		
	}

	public Cricle(int r) {
		
		this.radius = r;
	}
	

	public int getRadius() {
		return radius;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return pi*radius*radius;
	}
	
	
}
