package exercise.oop;

public class rectangle extends shape {
	
	private int len;
    private int wid;
	
    public int getLen() {
	return len;
	}
	public void setLen(int len) {
		this.len = len;
	}
	public int getWid() {
		return wid;
	}
	public void setWid(int wid) {
		this.wid = wid;
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return len*wid;
	}
    
    

}
