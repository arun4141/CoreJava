package collectionsframework;

import java.util.ArrayList;
import java.util.Objects;

public class hashcode {
	public static void main(String[] args) {
	//	String  s = "java";
	  //  String s1 = "java";
		
	
	    
	   // System.out.println(s.hashCode());
     //System.out.println(s.hashCode());
	
	
	ArrayList a = new ArrayList<>();
	
	a.add("one");
	a.add("two");

	int size = a.size();
	for (int i = 0; i < size; i++) {
		
		//System.out.println( i + " : " + a.get(i));
		Object o = a.get(i);
		System.out.println(i + " : " + o); 
		
		
	}
	
	
	
	
	
	
	
	
	
	}
	

	}
    
	
	


