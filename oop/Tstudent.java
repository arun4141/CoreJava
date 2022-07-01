package person.set.get.oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TStudent {
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat d = new SimpleDateFormat("dd/mm/yyyy");
		 String t = "21/07/2000";
		 Date e = d.parse(t);
		 
		 Student s = new Student ();
		 
		 s.setName("Arun");
		 s.setAddress("raj nagar indore");
		 s.setRollNo("96856666");
		 s.setMarks(405);
		 s.setDod(e);
		 
		 
		 System.out.println(s.getName());
		 System.out.println(s.getAddress());
		 System.out.println(s.getRollNo());
		 System.out.println(s.getMarks());
		 System.out.println(s.getDod());
	}

}
