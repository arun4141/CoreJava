package collectionsframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestMarksheet2 {
	
	public static void main(String[] args) {
		
		Marksheet2 m1 = new Marksheet2("45454", "arun"," mandloi", 58, 47, 45);
		
	//	Marksheet2 m1 = new Marksheet2("3", "A", "Patel", 75, 62, 78);
		
		Marksheet2 m2 = new Marksheet2("1", "c", "sharma", 78, 25, 65);
		
		Marksheet2 m3 = new Marksheet2("3", "b", "Ojha", 72, 74, 63);
		
		ArrayList l = new ArrayList();
		
		OrderByLname o = new OrderByLname();
		
		l.add(m1);
		l.add(m2);
		l.add(m3);
		
        Collections.sort(l,o);
		
		Iterator i = l.iterator();
		
		while (i.hasNext()) {
			Marksheet2 mar = (Marksheet2) i.next();
			
			System.out.println(mar.getRollno()+" "+mar.getFname()+" "+mar.getLname()+" "+mar.getSos()+" "+mar.getEnglish()+" "+mar.getManthes());
	}

}
	}
