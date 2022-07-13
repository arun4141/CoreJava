package collectionsframework;

import java.util.ArrayList;
import java.util.List;

public class sample {
	
	public static void main(String[] args) {
		
	List c = new ArrayList<>();
	
	c.add("bura mat dekho");
	c.add("bura mat suno");
	c.add("bura mat kaho");
	
	System.out.println(c.size());
	
	for (Object object : c) {
		System.out.println(object);
		
	}
            Object[]oArray = c.toArray();	
	}

}
