package inputoutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Testmarksheet2 {

	public static void main(String[] args) throws Exception {
		
		FileInputStream File = new FileInputStream("C:\\Users\\admin\\Desktop\\New folder (2)\\marksheetbean.txt");
		ObjectInputStream in = new ObjectInputStream(File);
		
		MarksheetBean m =(MarksheetBean)in.readObject();
		System.out.println("-----------------------------");
		System.out.println("-----------------------------");
		System.out.println("name      : "+m.getName());
		System.out.println("Chemistry : "+m.getChemistry());
		System.out.println("maths     : "+m.getMaths());
		System.out.println("Physics   : "+m.getPhysics());
		System.out.println(m.getTemp());
		System.out.println("-----------------------------");
		System.out.println("-----------------------------");
		
	
	}
}
