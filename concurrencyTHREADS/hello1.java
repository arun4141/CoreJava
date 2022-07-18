package concurrencyTHREADS;

public class hello1 extends ThrednameExtandThread implements Runnable{

	public hello1(String name) {
		super(name);
	
	}

	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(name);
		}
		super.run();
	}

	public static void main(String[] args) {
		hello1 h = new hello1("RAM");
		hello1 h1 = new hello1("shyam");
		
		h.start();
		h1.start();
	}


	

	
	}


