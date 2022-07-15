package exercisecollections;

import java.util.HashSet;

public class textexercise4  extends exercise4 {
	
	public static void main(String[] args) {
		HashSet h = new HashSet<>();
		h.add("Arunsinghmandloi");
		System.out.println(h.hashCode());
		System.out.println(h.equals(h));
		
	}

}
