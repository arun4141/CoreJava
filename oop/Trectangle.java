package exercise.oop;

public class Trectangle {
	public static void main(String[] args) {
		
		rectangle r = new rectangle();
		
		r.setBw("5");
		r.setColor("red");
		r.setLen(5);
		r.setWid(5);
		
		System.out.println("BW = " + r.getBw());
		System.out.println("-----------------");
		System.out.println("color = " + r.getColor());
		System.out.println("-----------------");
		System.out.println("len = " + r.getLen());
		System.out.println("-----------------");
		System.out.println("hight = " + r.getWid());
		System.out.println("-----------------");
		System.out.println("area = " + r.area());
		System.out.println("-----------------");
	}

}
