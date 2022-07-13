package collectionsframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sorting {
	
		
		public static void main(String[] args) {
			List li = new ArrayList<>();
			li.add(44);
			li.add(78);
			li.add(65);
			li.add(44);
			li.add(78);
			li.add(65);
			
			Collections.sort(li);
			
			System.out.println(li);
		}
		
		
		
	}

