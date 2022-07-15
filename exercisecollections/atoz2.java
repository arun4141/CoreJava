package exercisecollections;

import java.util.Iterator;
import java.util.Stack;

public class atoz2 {
	
	public static void main(String[] args) {
		
		Stack s = new Stack<>();
		Stack s1 = new Stack<>();
		
		for (int i = 65; i <=90 ; i++) {
			s.push((char)i);
			
		}
		Iterator it = s.iterator();
		while (it.hasNext()) {
			s1.push(s.pop());
			
			
		}
		for (Object obj : s1) {
			System.out.println(obj);
		}
	}

}
