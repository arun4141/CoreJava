package person.set.get.oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TDoctor {
	
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat d = new SimpleDateFormat("dd/mm/yyyy");
		 String t = "21/07/2000";
		 Date e = d.parse(t);
		 
		 
		 Doctor D = new Doctor();
		 
		D.setName("arun");
		D.setAddress("raj nagar indore");
		D.setRegistrationNO("65665655656");
		D.setDod(e);
		
		
		System.out.println(D.getName());
		System.out.println(D.getAddress());
		System.out.println(D.getRegistrationNO());
		System.out.println(D.getDod());
	}

}
