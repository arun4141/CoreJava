package Inheritance.shape.oop.abstrac;

public class Trectangle {
	public static void main(String[] args) {

		rectangle r = new rectangle(5, 5);

		r.setBorderWidth(5);
		r.setColor("red");

		System.out.println(r.getBorderWidth());
		System.out.println(r.getColor());
		
		System.out.println(r.area());
	}

}
