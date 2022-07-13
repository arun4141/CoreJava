package collectionsframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;



public class interator {
	public static void main(String[] args) {
		
		
		List l = new ArrayList<>();
	
		l.add(12);
		l.add(45);
		l.add(44);
		l.add(78);
		l.add(55);
		l.add(89);
		
	
	 Iterator I = l.iterator();
	 while (I.hasNext()) {
		Object object = (Object) I.next();
		
		 System.out.println(l);
		
		
	}

		
		
	}
	
	


}
