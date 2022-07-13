package collectionsframework;

import java.util.Comparator;

public class OrderByLname implements Comparator<Marksheet2> {

	public int compare(Marksheet2 o1, Marksheet2 o2) {
		
		if (o1.getFname().equals(o2.getFname())) {
			return o1.getLname().compareTo(o2.getLname());
		} else {
			return o1.getFname().compareTo(o2.getFname());
		
			
			
	}
	
	

}
	}
