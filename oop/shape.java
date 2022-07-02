package exercise.oop;

public abstract class shape {
	
	private String color;
	private String bw;
	
	public static final double pi = 3.14;
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBw() {
		return bw;
	}
	public void setBw(String bw) {
		this.bw = bw;
	}
	
	public abstract double area();

}
