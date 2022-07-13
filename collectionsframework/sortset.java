package collectionsframework;

import java.util.SortedSet;
import java.util.TreeSet;

public class sortset {
    public static void main(String[] args) {
		 
    	  SortedSet so = new TreeSet<>();
    	  
    	  so.add("one");
    	  so.add("two");
    	  so.add("three");
    	  so.add("onf");
    	  
    	  for (Object object : so) {
    		  System.out.println(object);
			
		}
    	  
    	  System.out.println(so);
	}
}
