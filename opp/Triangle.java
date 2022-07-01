package shape.opp;

public class Triangle extends shape {
	
	private int base;
	private int hight;
	
	public Triangle () {
		
	}
	
	
	public Triangle(int base, int hight) {
		
		this.base = base;
		this.hight = hight;
	}


	public int getBase() {
		return base;
	}


	public int getHight() {
		return hight;
	}
	
	public double area () {
		return base*hight;
		
		
	}
	

}
