package concurrencyTHREADS;

public class Hello extends ThrednameExtandThread implements Runnable{

		
	String name;

	public Hello(String name) {
		super(name);
		name = name;
	}
    public void num() {
    	for (int i = 0; i < 50; i++) {
    		System.out.println(name);
			
		}
    }
public static void main(String[] args) {
	Hello h = new Hello("ram" );
	
	h.start();
	Hello h1 = new Hello("shyam");
	h1.start();
}

    
    
}
