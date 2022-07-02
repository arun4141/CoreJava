package exercise.oop;

public class TTriangle {
	public static void main(String[] args) {
		
		Triangle t = new Triangle ();
		
		t.setColor("red");
		t.setBw("de");
		t.setHight(5);
		t.setBase(6);
		
		
		
		
		
		
		System.out.println(t.getColor());
		
		System.out.println(t.getBw());
		System.out.println(t.getBase());
		System.out.println(t.getHight());
	    System.out.println(t.area());
	}

}
