package collectionsframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import overloding.oop.Addition;

public class synchronize {
	public static void main(String[] args) {
		
		
		List li = new ArrayList<>();
		
	List l = Collections.synchronizedList(li); 
		
		l.add(45);
		l.add(65);
		l.add(55);
		l.add(69);
		l.add(32);
		l.add(14);
		l.add(68);
		
		System.out.println(l);
		
	 Set s = new HashSet<>();
	 Set p = Collections.synchronizedSet(s);
	
	    p.add(45);
		p.add(5.2);
		p.add("arun");
		p.add('a');
		p.add(32);
		p.add(14);
		p.add(68);
	 
	 
		System.out.println(p);
		
		  SortedSet m = new TreeSet<>();
		  
		  SortedSet k = Collections.synchronizedSortedSet(m);
		  
		  k.add(45);
			k.add(65);
			k.add(55);
			k.add(69);
			k.add(32);
			k.add(14);
			k.add(68);
			
			System.out.println(k);
			
	
		
			
			
	}

}
