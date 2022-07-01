package shape.opp;

public class poly {
	public static void main(String[] args) {
		
	
	
	shape[] s = new shape[3];

	s[0] = new Cricle(5);
	s[1] = new Rectangle(5, 5);
	s[2] = new Triangle(2, 10);

	double totalArea = 0.0;

	for (int i = 0; i < s.length; i++) {

		totalArea = totalArea + s[i].area();
	}

	System.out.println("Total Area = " + totalArea);
}

}
