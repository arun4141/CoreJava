package person.set.get.oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TBusinessman {
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat d = new SimpleDateFormat("dd/mm/yyyy");
		 String t = "21/07/2000";
		 Date e = d.parse(t);
		 
		 Businessman B = new Businessman();
		 
		 
		 B.setName("arun");
		 B.setAddress("raj");
		 B.setIncome(2000);
		 B.setDod(e);
			 
		 System.out.println(B.getName());
		 System.out.println(B.getAddress());
		 System.out.println(B.getIncome());
		 System.out.println(B.getDod());
	}

}
