package Inheritance.shape.oop.abstrac;

public abstract class shape {
	
	
	
	private String color;
	private int borderWidth ;
	
	public static final double pi = 3.14;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getBorderWidth() {
		return borderWidth;
	}
	public void setBorderWidth(int borderWidth) {
		this.borderWidth = borderWidth;
	}
	public abstract double area() ;
		
	
	
}
