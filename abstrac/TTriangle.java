package Inheritance.shape.oop.abstrac;

public class TTriangle {
	public static void main(String[] args) {
		
		Triangle t = new Triangle(5, 5) ;
		
		t.setBorderWidth(6);
		t.setColor("red");
		
		System.out.println(t.getBorderWidth());
		System.out.println(t.getColor());
		
		System.out.println(t.area());
	}

}
