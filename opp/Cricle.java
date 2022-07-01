package shape.opp;

public class Cricle extends shape {

	private int radius;
	private String color;
	private int borderWith;
	
	public Cricle () {
		
	}

	public Cricle(int radius) {

		this.radius = radius;

	}

	public int getRadius() {
		return radius;
	}

	public double area() {
		return PI * radius * radius;
	}

}
