package collectionsframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Testmarksheet {
	
	public static void main(String[] args) {
		
		
		marksheet m1 = new marksheet();
		
		m1.setRollno("96864545");
		m1.setFname("arun");
		m1.setMname("singh");
		m1.setLname("mandloi");
		m1.setEnglish(45);
		m1.setHindi(48);
		m1.setSanskrit(65);
		m1.setSec(78);
		m1.setSos(65);
		m1.setManthes(65);
		
		marksheet m2 = new marksheet();
		m2.setRollno("96864545");
		m2.setFname("anshul");
		m2.setMname("null");
		m2.setLname("p");
		m2.setEnglish(45);
		m2.setHindi(48);
		m2.setSanskrit(65);
		m2.setSec(78);
		m2.setSos(65);
		m2.setManthes(65);
		
		marksheet m3 = new marksheet();
		m3.setRollno("96864545");
		m3.setFname("aryan");
		m3.setMname("null");
		m3.setLname("sharma");
		m3.setEnglish(45);
		m3.setHindi(48);
		m3.setSanskrit(65);
		m3.setSec(78);
		m3.setSos(65);
		m3.setManthes(65);
		
		marksheet m4 = new marksheet();
		m4.setRollno("96864545");
		m4.setFname("vishwas");
		m4.setMname("null");
		m4.setLname("sharma");
		m4.setEnglish(45);
		m4.setHindi(48);
		m4.setSanskrit(65);
		m4.setSec(78);
		m4.setSos(65);
		m4.setManthes(65);
		
		marksheet m5 = new marksheet();
		m5.setRollno("96864545");
		m5.setFname("nikita");
		m5.setMname("null");
		m5.setLname("rathore");
		m5.setEnglish(45);
		m5.setHindi(48);
		m5.setSanskrit(65);
		m5.setSec(78);
		m5.setSos(65);
		m5.setManthes(65);
		
		
		
		
		
		ArrayList li = new ArrayList<>();
		
		li.add(m1);
		li.add(m2);
		li.add(m3);
		li.add(m4);
		li.add(m5);
		
		Collections.sort(li);
		
		Iterator it = li.iterator();
		while (it.hasNext()) {
			marksheet m = (marksheet) it.next();
			
			System.out.println(m.getRollno()+" "+ m.getFname()+" "+ m.getMname()+" "+ m.getLname()+" "+ m.getEnglish()+" "+ m.getHindi()+" "+ m.getSanskrit()+" "+ m.getSos()+" "+ m.getSec()+" "+ m.getManthes());
		}
		
		
	}



}
