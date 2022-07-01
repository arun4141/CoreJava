package shape.set.get.oop;


public class Cricle extends shape {
	
	private int radius;
	
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
  
	public double area () {
		return PI*radius*radius;
	}
	
}
