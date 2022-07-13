package collectionsframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import in.co.rays.testString.vedant;

public class Raju {
	public static void main(String[] args) {
		 List v = new ArrayList<>();
		 
		 v.add("raju");
		 
		Iterator it = v.iterator();
		while (it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
			
		}
	}

	

	 
	 
	
	 
}
