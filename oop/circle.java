package exercise.oop;

public class circle extends shape {

	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		
		return pi*radius*radius;
	}
	
	
	}
	
	
	 
	 



