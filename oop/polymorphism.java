package shape.set.get.oop;

import com.rays.oop.circle;

public class polymorphism {
	public static void main(String[] args) {
		
		shape[] s = new shape[3];
		
		s[0] = new Rectangle();
		s[1] = new Cricle();
		s[2]= new Triangle();
		
		Rectangle r = (Rectangle) s[0];
		r.setLen(5);
		r.setWid(4);
		
		Cricle C = (Cricle) s[1];
		C.setRadius(5);
		
		Triangle T = (Triangle) s[2];
		T.setBase(5);
		T.setHight(5);
		
		
	
		double totalArea = 0.0;

		for (int i = 0; i < s.length; i++) {

			totalArea = totalArea + s[i].area();
		}

		System.out.println("Total Area = " + totalArea);
	
	}
	
}

	
