package concurrencyTHREADS;

import exercisecollections.textEmp1;

public class Thredname {
	
	private String name;
	
	
	
	
	
	
	
	
	
	public Thredname(String name) {
	
		this.name = name;
	}

	public void text() {
		
		for (int i = 0; i < 50; i++) {
			System.out.println(i+" "+name);
			
			
		}
	
		

		
	}
	
	public static void main(String[] args) {
	
		Thredname t = new Thredname("ram");
		Thredname t1 = new Thredname("shram");
		
		t.text();
		t1.text();
		
		
		
		
		
		
	}

}
