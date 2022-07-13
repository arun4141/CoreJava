package collectionsframework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class setinterface {
	public static void main(String[] args) {
		
		//Set s = new HashSet<>();
	
	//	Set s = new LinkedHashSet<>();
		
		Set s = new  TreeSet<>();
		
		s.add(12);
		s.add(1);
		s.add(100);
		s.add(125);
		s.add(86);
		s.add(78);
		s.add(5);
		s.add(79);
		s.add(6);
		
		//for (Object object : s) {
			//System.out.println(object);
			
		//}
		
		System.out.println(s);
		
		
		
		
		
		
	}

}
