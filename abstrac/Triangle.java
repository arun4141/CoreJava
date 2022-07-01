package Inheritance.shape.oop.abstrac;

public class Triangle extends shape {
	
	private int height;
	private int base ;
	
	public Triangle () {
		
	}

	public Triangle(int height, int base) {
		super();
		this.height = height;
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public int getBase() {
		return base;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return height*base;
	
        
}
}
