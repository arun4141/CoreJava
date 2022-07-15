package exercisecollections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Q6 {
	public static void main(String[] args) {
		Set s = new HashSet<>();
		
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		s.add(5);
		s.add(6);
		s.add(7);
		s.add(8);
		s.add(9);
		s.add(10);
		
		
		
		 Iterator it = s.iterator();
		 while (it.hasNext()) {
			Object object = (Object) it.next();
			System.out.println(object);
			System.out.println("---------");
		 }	
		 
			
			Set k = new TreeSet<>();
			
			k.add(1); k.add(66);k.add(3);k.add(66);k.add(1);
			k.add(1);k.add(1);k.add(58);k.add(1);k.add(78);
			
			 
			Iterator iy = k.iterator();
			while (iy.hasNext()) {
				Object object = (Object) iy.next();
				System.out.println(object);
				System.out.println("---------");
				
				
			}
			
			Set i = new LinkedHashSet<>();
			
			i.add(45);		i.add(78);		i.add(45);		i.add(45);		i.add(45);
			i.add(45);		i.add(45);		i.add(45);		i.add(45);		i.add(45);
			
			
		Iterator h = i.iterator();		
		while (h.hasNext()) {
			Object object = (Object) h.next();
						System.out.println(object);
						System.out.println("---------");
		}
			
			
			
			
		}
		
		
		
		
	}
	

	


