package shape.opp;

public class shape {

	private String color;
	private int borderWidth;

	public static final double PI = 3.14;

	public shape() {
	}

	public shape(String color, int borderWidth) {

		this.color = color;
		this.borderWidth = borderWidth;
	}

	public String getColor() {
		return color;
	}

	public int getBorderWidth() {
		return borderWidth;
	}

	public double area() {
		return 0.0;
	}

}
