package lemrajava8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;

public class foreachmethod {
	public static void main(String[] args) {
		
	
	ArrayBlockingQueue<Integer> a = new ArrayBlockingQueue<Integer>(11);        // number add 
	
	
	//ArrayList<Integer> a = new ArrayList<Integer>();
	
	a.add(12);
	a.add(20);
	a.add(45);
	a.add(14);
	a.add(18);
	a.add(14);
	a.add(126);
	a.add(187);
	a.add(127);
	a.add(126);
	
	//a.forEach(li -> System.out.println(li));    (1)
	
	//
	//
	//
	
	Iterator it = a.iterator();                 // (2)

	a.add(458);
	
	while (it.hasNext()) {
		Object object = (Object) it.next();
		System.out.println(object);
		
	}
	}
	
	
	
	}




