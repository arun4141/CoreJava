package exercise.oop;

public class Tcircle {
	public static void main(String[] args) {
		
		circle c= new circle();
		
		c.setBw("5");
		c.setColor("red");
		c.setRadius(5);
		
		System.out.println("Area = " + c.getRadius());
		System.out.println("--------------------");
		System.out.println("color name = " + c.getColor());
		System.out.println("--------------------");
		System.out.println("bw = " + c.getBw());
		System.out.println("--------------------");
	}

}
