package exercise.oop;

public class Triangle extends shape {
	
	private int base;
    private int hight;
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getHight() {
		return hight;
	}
	public void setHight(int hight) {
		this.hight = hight;
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return base*hight;
	}
    
    
	
	

}
