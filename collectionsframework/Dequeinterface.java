package collectionsframework;

import java.util.ArrayDeque;

import overloding.oop.Addition;

public class Dequeinterface {

	public static void main(String[] args) {
		
		 ArrayDeque a = new ArrayDeque<>();
		 
		      a.add(78);
		      a.add(9);
		      a.add(85);
		      a.add(98);
		     
		      a.peekLast();
		      //a.poll();
		      // a.removeLast();
		     	      //a.removeFirst();
		    //  a.addFirst(76);
		      
		      System.out.println(a);
	}
}
