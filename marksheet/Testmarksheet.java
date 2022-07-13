package marksheet;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;



public class Testmarksheet {
	
	public static void main(String[] args) {
		
		
		marksheet m1 = new marksheet();
		
		m1.setRollno("45865965");
		m1.setFname("Arun");
		m1.setLname("mandloi");
		m1.setId(1);
		
           
	marksheet m2 = new marksheet();
		
		m2.setRollno("45865965");
		m2.setFname("Anshul");
		m2.setLname("mandloi");
		m2.setId(4);
 
		marksheet m3 = new marksheet();
		
		m3.setRollno("45865965");
		m3.setFname("Arun");
		m3.setLname("mandloi");
		m3.setId(2);
		
		
		ArrayList a = new ArrayList<>();
		
		a.add(m1);
		a.add(m2);
		a.add(m3);
		
		
		Collections.sort(a);
		
		Iterator it = a.iterator();
		
		while (it.hasNext()) {
			marksheet m = (marksheet) it.next();
			
			System.out.println(m.getRollno()+ " " + m.getFname()+" " + m.getLname()+" " + m.getId());
			
			
		
			
		}
		
		
		
		
	}

}
