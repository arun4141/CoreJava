package Inheritance.shape.oop.abstrac;

public class rectangle extends shape {
	private int len;
	private int wid;

	public rectangle() {
		
	}

	public rectangle(int len, int wid) {
		super();
		this.len = len;
		this.wid = wid;
	}
	

	public int getLen() {
		return len;
	}

	public int getWid() {
		return wid;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return len*wid;
	}

}
