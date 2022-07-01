package shape.opp;

public class Rectangle extends shape {
	
	private int len;
	private int width;
	
	public Rectangle() {
		
	}
	
	
	public Rectangle(int len, int width) {
		
		this.len = len;
		this.width = width;
	}
	public int getLen() {
		return len;
	}
	public int getWidth() {
		return width;
	}
	
	public double area () {
		return len*width;
	}
	
	

}
