package inputoutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;


public class textmark2 {
	
	public static void main(String[] args) throws Exception {
		FileInputStream file = new FileInputStream("C:\\Users\\admin\\Desktop\\New folder (2)\\mark3.txt");
		ObjectInputStream out = new ObjectInputStream(file);
		
		Marksheet3const  m = (Marksheet3const)out.readObject();
		
		System.out.println("name        : " +m.getName());
		System.out.println("maths       : " +m.getMaths());
		System.out.println("chemistrey  : " +m.getChemistry());
		System.out.println("physics     : " +m.getPhysics());
		System.out.println("temp        : " +m.getTemp());
		
	}

}
