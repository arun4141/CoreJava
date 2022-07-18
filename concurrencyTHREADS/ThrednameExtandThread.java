package concurrencyTHREADS;

public class ThrednameExtandThread extends Thread {
	
	protected String name;

	public ThrednameExtandThread(String name) {
		
		this.name = name;
	}
	
	public void run() {
		for (int i = 0; i < 50; i++) {
			
		
			
			
			System.out.println(i+" "+name);
			
		}
	}
	public static void main(String[] args) {
		ThrednameExtandThread t = new ThrednameExtandThread("ram");
		t.setPriority(10);
		t.start();
		ThrednameExtandThread t1 = new ThrednameExtandThread("shyam");
		t1.setPriority(1);
		t1.start();
	}
	

}
